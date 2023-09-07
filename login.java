<script language="javascript">
 
function loginPage(form) {
if (form.userName.value=="username") { 
if (form.passWord.value=="password") {              
location="home.html" 
} else {
alert("Incorrect detail Password")
}
} else {  alert("Incorrect detail Username")
}
}
 
</script>