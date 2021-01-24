$(document).ready(function () {
    $('#sameAddress').click(function () {
        if ($(this).is(':checked')) {
            disableActualAddressFields(true);
        } else {
            disableActualAddressFields(false);
        }
    });

    setCustomerSex();

    function setCustomerSex() {
        let sex = $('#customerSexHidden').attr("value");
        console.log(sex);
        if (sex === 'male') {
            $("#customerSex").val(sex);
        } else if (sex === 'female') {
            $("#customerSex").val(sex);
        }
    }

    function disableActualAddressFields(DisableParam) {
        $('#actualAddressTable tbody input.ableToDisable').each(function () {
            $(this).prop('disabled', DisableParam);
        });
    }
});