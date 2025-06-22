
// ister $ ister jQuery
$(document).ready(function () {
    //h2 tag
    $("h2").mouseover(function () {
        $("#parag_id").css("color", "white").css("backgroundColor", "black");
    })

    //double click Hide
    $("#button_id_dblclick_hide").dblclick(function () {
        jQuery("#parag_id").hide();
    });

    $("#button_id_dblclick_show").mouseover(function () {
        $("#parag_id").show(2000);
    })

    //click event
    $(".button_class_click").click(() => {
        //CSS
        //css object added important: css camelCase 
        const jqueryObject = {
            "backgroundColor": "black",
            "padding": "1rem",
            "boxShadow": "1px 1px 3px 1px rgba(0,0,0,.8)",
        };
        $("#parag_id")
            .html("html data")
            .css("color", "white").css(jqueryObject);
    });
});

//animate

// STEP-1
// listeye eklenen checkbox check yaparsak üstünü çizsin 
// chechk kaldırırsak üstünü çizdemen görünsün

// STEP-2
// listede 2 kere tıkladığımızda tıkladığımız liste silinsin.
$(document).ready(function () {
    //button
    const buttonInputVal = $("#button_input_val");
    const buttonInputCss = {
        width: "3.5%",
        height: "2rem",
        opacity: ".8"
    };
    const MS = 3000;
    buttonInputVal.click(() => {
        buttonInputVal.animate(buttonInputCss, MS, () => {
            alert("tamamlandı...")
        });

        //input
        let value = $("#input_data").val();
        const inputFormCheck = '<input class="form-check-input" type="checkbox" id="check_id"></li>';
        $("#ul_data")
            .append(`<li class="list-group-item">
                ${value} ${inputFormCheck}`);

        //1 kere tıklandığında
        $("#ul_data li ").click(function () {
            //const isCheckedValue=$("input[type='checkbox']").val();
            if ($('#check_id').is(":checked")) {
                $(this).css("text-decoration", "line-through");
            } else {
                $(this).css("text-decoration", "none");
            }
        });

        //2 kere tıkladığımızda
        $("#ul_data li").dblclick(function () {
            $(this).hide();
        })//end dblclick
    }); //end buttonInputVal
}); //end $(document).ready