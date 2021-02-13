$(function(){
            $('#value1, #value2 , #value3, #value4, #value5, #value6').keyup(function(){
               var value1 = parseFloat($('#value1').val()) || 0;
               var value2 = parseFloat($('#value2').val()) || 0;
                var value3 = parseFloat($('#value3').val()) || 0;
                var value4 = parseFloat($('#value4').val()) || 0;
                var value5 = parseFloat($('#value5').val()) || 0;
                var value6 = parseFloat($('#value6').val()) || 0;
               $('#sum').text(value1 + value2 + value3 + value4 + value5 + value6);
            });
         });