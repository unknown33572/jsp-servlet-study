function loginCheck() {
  if(document.frm.uid.value.length == 0) {
    alert("아이디를 써주세요.");
    frm.uid.focus();
    return false;
  }
  if(document.frm.pwd.value == "") {
    alert("암호는 반드시 입력해야 합니다.");
    frm.pwd.focus();
    return false;
  }
  return true;
}

document.forms["frm"]["uid"].addEventListener("blur", function() {
  let uid = this.value;
  if(uid.length < 4) {
    document.getElementById("idError-message").textContent = "id는 4글자 이상이어야 합니다.";
    return false;
  } else {
    document.getElementById("idError-message").textContent = "";
  }
});

document.forms["frm"]["upw_check"].addEventListener("blur", function() {
  let upw = document.forms["frm"]["upw"].value;
  let upw_check = this.value;

  let uid = document.forms["frm"]["uid"].value;

  const pwErrorMessage = document.getElementById("pwError-message");
  if (upw !== upw_check) {
    pwErrorMessage.textContent = "비밀번호와 비밀번호 확인이 일치하지 않습니다.";
  } else {
    pwErrorMessage.textContent = "";
  }

});

const validateForm = () => {
  let uid = document.forms["frm"]["uid"].value;
  let upw = document.forms["frm"]["upw"].value;
  let upw_check = document.forms["frm"]["upw_check"].value;
  let uname = document.forms["frm"]["uname"].value;
  let gender = document.forms["frm"]["gender"].value;

  if(uid === "" || upw === "" || uname === "" || gender === "") {
    alert("필수 항목을 입력해주세요.");
    return false;
  }
}

const idCheck = function() {
  if(document.frm.uid.value == "") {
    alert('아이디를 입력하여 주십시오.');
    document.frm.uid.focus();
    return;
  }
  let url = "idCheck.do?uid=" + document.frm.uid.value;
  window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}