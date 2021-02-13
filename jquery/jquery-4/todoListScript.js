$(document).ready(function() {
  $('#submit').click(function() {
    if (!$('#task').val()) {
      alert('enter task details');
    }
      else{
          var str=$('#task').val();
          $('#output').append(str+"</br>");
          $('#task').val("");
      }
  })
});