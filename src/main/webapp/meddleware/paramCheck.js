function check() {
  if(document.frm.name.value == "") {
    alert("이름을 입력하세요.");
    document.frm.name.focus();
    return false;
  } else if(document.frm.age.value == "") {
      alert("나이를 입력하세요.");
      document.frm.age.focus();
      return false;
  } else if(isNaN(document.frm.age.value)) {
      alert("나이는 숫자로 입력하세요.");
      document.frm.age.focus();
      return false;
  } else {
    return true;
  }
}