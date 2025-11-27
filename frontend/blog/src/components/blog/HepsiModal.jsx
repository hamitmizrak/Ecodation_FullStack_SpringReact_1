import React, { useEffect, useState } from "react";
import axios from "axios";
import ReusableToast from "../resuability/ReusableToast";
import { showSuccess, showError } from "../resuability/toastHelper";
import { API_BASE, ENDPOINTS, IMAGE_BASE } from "../../config/api";

// API Yardımcıları
const resolveImageUrl = (src) =>
    !src ? "" : /^https?:\/\//i.test(src) ? src : `${IMAGE_BASE}${src.startsWith("/") ? src : "/" + src}`;
const formatDate = (iso) => !iso ? "" : new Date(iso).toLocaleString("tr-TR", { timeZone: "Europe/Istanbul" });

export default function HepsiModal() {
    // About Listesi
    const [abouts, setAbouts] = useState([]);
    // Modal kontrolleri
    const [showCreate, setShowCreate] = useState(false);
    const [showEdit, setShowEdit] = useState(false);
    const [showView, setShowView] = useState(false);
    const [showDelete, setShowDelete] = useState(false);
    // Form ve detaylar
    const [selectedAbout, setSelectedAbout] = useState(null);
    const [form, setForm] = useState({
        aboutName: "",
        mission: "",
        vision: "",
        imageUrl: "",
        imageFile: null,
    });
    const [formError, setFormError] = useState({});
    const [spinner, setSpinner] = useState(false);

    // Listeyi yükle
    const fetchAbouts = async () => {
        try {
            const res = await axios.get(`${API_BASE}${ENDPOINTS.ABOUT.LIST}`);
            setAbouts(res.data?.data || res.data?.result || res.data || []);
        } catch {
            showError("Hakkımızda listesi yüklenemedi");
        }
    };

    useEffect(() => {
        fetchAbouts();
    }, []);

    // FORM FIELD CHANGE
    const handleFormChange = (e) => {
        const { name, value, files } = e.target;
        if (name === "imageFile") {
            setForm((prev) => ({ ...prev, imageFile: files[0] }));
        } else {
            setForm((prev) => ({ ...prev, [name]: value }));
        }
        setFormError((prev) => ({ ...prev, [name]: undefined }));
    };

    // CREATE MODAL AÇ
    const openCreateModal = () => {
        setForm({
            aboutName: "",
            mission: "",
            vision: "",
            imageUrl: "",
            imageFile: null,
        });
        setFormError({});
        setShowCreate(true);
    };

    // EDIT MODAL AÇ
    const openEditModal = (about) => {
        setSelectedAbout(about);
        setForm({
            aboutName: about.aboutName || "",
            mission: about.mission || "",
            vision: about.vision || "",
            imageUrl: about.imageUrl || "",
            imageFile: null,
        });
        setFormError({});
        setShowEdit(true);
    };

    // VIEW MODAL AÇ
    const openViewModal = async (about) => {
        setSelectedAbout(about);
        setShowView(true);
    };

    // DELETE MODAL AÇ
    const openDeleteModal = (about) => {
        setSelectedAbout(about);
        setShowDelete(true);
    };

    // CREATE SUBMIT
    const handleCreate = async (e) => {
        e.preventDefault();
        let err = {};
        if (!form.aboutName) err.aboutName = "About Name zorunlu.";
        if (!form.mission) err.mission = "Misyon zorunlu.";
        if (!form.vision) err.vision = "Vizyon zorunlu.";
        setFormError(err);
        if (Object.keys(err).length > 0) return;

        setSpinner(true);
        try {
            const dto = {
                aboutName: form.aboutName,
                mission: form.mission,
                vision: form.vision,
                imageUrl: form.imageUrl,
            };
            let res;
            if (form.imageFile) {
                const fd = new FormData();
                fd.append("about", new Blob([JSON.stringify(dto)], { type: "application/json" }));
                fd.append("file", form.imageFile);
                res = await axios.post(`${API_BASE}${ENDPOINTS.ABOUT.CREATE}`, fd, { headers: { "Content-Type": "multipart/form-data" } });
            } else {
                res = await axios.post(`${API_BASE}${ENDPOINTS.ABOUT.CREATE}`, dto);
            }
            showSuccess("Kayıt başarıyla eklendi!");
            setShowCreate(false);
            fetchAbouts();
        } catch (err) {
            showError("Kayıt eklenemedi! " + (err.response?.data?.message || ""));
            setFormError(err.response?.data?.validationErrors || {});
        }
        setSpinner(false);
    };

    // UPDATE SUBMIT
    const handleEdit = async (e) => {
        e.preventDefault();
        let err = {};
        if (!form.aboutName) err.aboutName = "About Name zorunlu.";
        if (!form.mission) err.mission = "Misyon zorunlu.";
        if (!form.vision) err.vision = "Vizyon zorunlu.";
        setFormError(err);
        if (Object.keys(err).length > 0) return;

        setSpinner(true);
        try {
            const dto = {
                aboutName: form.aboutName,
                mission: form.mission,
                vision: form.vision,
                imageUrl: form.imageUrl,
            };
            let res;
            if (form.imageFile) {
                const fd = new FormData();
                fd.append("about", new Blob([JSON.stringify(dto)], { type: "application/json" }));
                fd.append("file", form.imageFile);
                res = await axios.put(`${API_BASE}${ENDPOINTS.ABOUT.UPDATE(selectedAbout.aboutId || selectedAbout.id)}`, fd, { headers: { "Content-Type": "multipart/form-data" } });
            } else {
                res = await axios.put(`${API_BASE}${ENDPOINTS.ABOUT.UPDATE(selectedAbout.aboutId || selectedAbout.id)}`, dto);
            }
            showSuccess("Kayıt başarıyla güncellendi!");
            setShowEdit(false);
            fetchAbouts();
        } catch (err) {
            showError("Kayıt güncellenemedi! " + (err.response?.data?.message || ""));
            setFormError(err.response?.data?.validationErrors || {});
        }
        setSpinner(false);
    };

    // DELETE
    const handleDelete = async () => {
        setSpinner(true);
        try {
            await axios.delete(`${API_BASE}${ENDPOINTS.ABOUT.DELETE(selectedAbout.aboutId || selectedAbout.id)}`);
            showSuccess("Kayıt silindi!");
            setShowDelete(false);
            fetchAbouts();
        } catch (err) {
            showError("Kayıt silinemedi!");
        }
        setSpinner(false);
    };

    return (
        <div className="container py-4">
            {/*Toast*/}
            <ReusableToast />

            <h2 className="text-center mb-4">About / Hakkımızda Listesi</h2>
            <button className="btn btn-primary mb-3" onClick={openCreateModal}>
                Yeni Kayıt Ekle
            </button>
            <table className="table table-bordered table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>About Name</th>
                    <th>Misyon</th>
                    <th>Vizyon</th>
                    <th>Görsel</th>
                    <th>Oluşturma</th>
                    <th>İşlem</th>
                </tr>
                </thead>
                <tbody>
                {abouts.length === 0 && (
                    <tr>
                        <td colSpan={7} className="text-center text-muted">
                            Kayıt bulunamadı.
                        </td>
                    </tr>
                )}
                {abouts.map((about) => (
                    <tr key={about.aboutId || about.id}>
                        <td>{about.aboutId || about.id}</td>
                        <td>{about.aboutName}</td>
                        <td>{about.mission}</td>
                        <td>{about.vision}</td>
                        <td>
                            {about.imageUrl ? (
                                <img src={resolveImageUrl(about.imageUrl)} alt="about" style={{ maxWidth: 80, maxHeight: 60, borderRadius: 6, boxShadow: "0 1px 8px rgba(0,0,0,0.06)" }} />
                            ) : (
                                <span className="text-muted small">RESİM YOK</span>
                            )}
                        </td>
                        <td>{formatDate(about.systemCreatedDate)}</td>
                        <td>
                            <button className="btn btn-sm btn-outline-secondary me-1" onClick={() => openViewModal(about)} title="Detay">
                                <i className="fa fa-eye" />
                            </button>
                            <button className="btn btn-sm btn-outline-primary me-1" onClick={() => openEditModal(about)} title="Düzenle">
                                <i className="fa fa-pen" />
                            </button>
                            <button className="btn btn-sm btn-outline-danger" onClick={() => openDeleteModal(about)} title="Sil">
                                <i className="fa fa-trash" />
                            </button>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>

            {/* CREATE MODAL */}
            {showCreate && (
                <div className="modal fade show d-block" tabIndex={-1}>
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <form onSubmit={handleCreate} encType="multipart/form-data">
                                <div className="modal-header">
                                    <h5 className="modal-title">Yeni Kayıt Ekle</h5>
                                    <button type="button" className="btn-close" onClick={() => setShowCreate(false)}></button>
                                </div>
                                <div className="modal-body">
                                    <div className="mb-3">
                                        <label className="form-label">About Name</label>
                                        <input type="text" className={`form-control ${formError.aboutName ? "is-invalid" : ""}`} name="aboutName" value={form.aboutName} onChange={handleFormChange} required />
                                        {formError.aboutName && <div className="invalid-feedback">{formError.aboutName}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Misyon</label>
                                        <textarea className={`form-control ${formError.mission ? "is-invalid" : ""}`} name="mission" value={form.mission} onChange={handleFormChange} required />
                                        {formError.mission && <div className="invalid-feedback">{formError.mission}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Vizyon</label>
                                        <textarea className={`form-control ${formError.vision ? "is-invalid" : ""}`} name="vision" value={form.vision} onChange={handleFormChange} required />
                                        {formError.vision && <div className="invalid-feedback">{formError.vision}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Görsel</label>
                                        <input type="file" className="form-control" name="imageFile" onChange={handleFormChange} accept="image/*" />
                                        {form.imageFile && (
                                            <img src={URL.createObjectURL(form.imageFile)} alt="Önizleme" className="mt-2 rounded" style={{ maxHeight: 80, maxWidth: 140 }} />
                                        )}
                                    </div>
                                </div>
                                <div className="modal-footer">
                                    <button type="button" className="btn btn-secondary" onClick={() => setShowCreate(false)}>
                                        Kapat
                                    </button>
                                    <button type="submit" className="btn btn-primary" disabled={spinner}>
                                        {spinner && <span className="spinner-border spinner-border-sm me-1"></span>}
                                        Kaydet
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div className="modal-backdrop fade show"></div>
                </div>
            )}

            {/* EDIT MODAL */}
            {showEdit && (
                <div className="modal fade show d-block" tabIndex={-1}>
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <form onSubmit={handleEdit} encType="multipart/form-data">
                                <div className="modal-header">
                                    <h5 className="modal-title">Kaydı Düzenle</h5>
                                    <button type="button" className="btn-close" onClick={() => setShowEdit(false)}></button>
                                </div>
                                <div className="modal-body">
                                    <div className="mb-3">
                                        <label className="form-label">About Name</label>
                                        <input type="text" className={`form-control ${formError.aboutName ? "is-invalid" : ""}`} name="aboutName" value={form.aboutName} onChange={handleFormChange} required />
                                        {formError.aboutName && <div className="invalid-feedback">{formError.aboutName}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Misyon</label>
                                        <textarea className={`form-control ${formError.mission ? "is-invalid" : ""}`} name="mission" value={form.mission} onChange={handleFormChange} required />
                                        {formError.mission && <div className="invalid-feedback">{formError.mission}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Vizyon</label>
                                        <textarea className={`form-control ${formError.vision ? "is-invalid" : ""}`} name="vision" value={form.vision} onChange={handleFormChange} required />
                                        {formError.vision && <div className="invalid-feedback">{formError.vision}</div>}
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Görsel</label>
                                        <input type="file" className="form-control" name="imageFile" onChange={handleFormChange} accept="image/*" />
                                        {form.imageFile ? (
                                            <img src={URL.createObjectURL(form.imageFile)} alt="Önizleme" className="mt-2 rounded" style={{ maxHeight: 80, maxWidth: 140 }} />
                                        ) : (
                                            form.imageUrl &&
                                            <img src={resolveImageUrl(form.imageUrl)} alt="Önceki" className="mt-2 rounded" style={{ maxHeight: 80, maxWidth: 140 }} />
                                        )}
                                    </div>
                                </div>
                                <div className="modal-footer">
                                    <button type="button" className="btn btn-secondary" onClick={() => setShowEdit(false)}>
                                        Kapat
                                    </button>
                                    <button type="submit" className="btn btn-primary" disabled={spinner}>
                                        {spinner && <span className="spinner-border spinner-border-sm me-1"></span>}
                                        Kaydet
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div className="modal-backdrop fade show"></div>
                </div>
            )}

            {/* VIEW MODAL */}
            {showView && selectedAbout && (
                <div className="modal fade show d-block" tabIndex={-1}>
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <div className="modal-header">
                                <h5 className="modal-title">Kayıt Detay</h5>
                                <button type="button" className="btn-close" onClick={() => setShowView(false)}></button>
                            </div>
                            <div className="modal-body">
                                <div><strong>ID:</strong> {selectedAbout.aboutId || selectedAbout.id}</div>
                                <div><strong>About Name:</strong> {selectedAbout.aboutName}</div>
                                <div><strong>Misyon:</strong> {selectedAbout.mission}</div>
                                <div><strong>Vizyon:</strong> {selectedAbout.vision}</div>
                                <div><strong>Görsel:</strong><br />
                                    {selectedAbout.imageUrl ? (
                                        <img src={resolveImageUrl(selectedAbout.imageUrl)} alt="about" style={{ maxHeight: 100, maxWidth: 200, borderRadius: 8 }} />
                                    ) : <span className="text-muted small">RESİM YOK</span>}
                                </div>
                                <div><strong>Oluşturma:</strong> {formatDate(selectedAbout.systemCreatedDate)}</div>
                            </div>
                            <div className="modal-footer">
                                <button className="btn btn-secondary" onClick={() => setShowView(false)}>
                                    Kapat
                                </button>
                            </div>
                        </div>
                    </div>
                    <div className="modal-backdrop fade show"></div>
                </div>
            )}

            {/* DELETE MODAL */}
            {showDelete && selectedAbout && (
                <div className="modal fade show d-block" tabIndex={-1}>
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <div className="modal-header">
                                <h5 className="modal-title text-danger">Silme Onayı</h5>
                                <button type="button" className="btn-close" onClick={() => setShowDelete(false)}></button>
                            </div>
                            <div className="modal-body">
                                <div>
                                    <b>{selectedAbout.aboutName}</b> başlıklı kaydı silmek istediğinize emin misiniz?
                                </div>
                                <div className="mt-2 text-muted">
                                    <strong>ID:</strong> {selectedAbout.aboutId || selectedAbout.id}
                                </div>
                            </div>
                            <div className="modal-footer">
                                <button className="btn btn-secondary" onClick={() => setShowDelete(false)}>
                                    Vazgeç
                                </button>
                                <button className="btn btn-danger" onClick={handleDelete} disabled={spinner}>
                                    {spinner && <span className="spinner-border spinner-border-sm me-1"></span>}
                                    Sil
                                </button>
                            </div>
                        </div>
                    </div>
                    {/* Modal backdrop */}
                    <div className="modal-backdrop fade show"></div>
                </div>
            )}
            {/* Ana container */}
        </div>
    );
}


