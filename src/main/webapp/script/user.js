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