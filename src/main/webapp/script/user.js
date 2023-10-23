document.addEventListener("DOMContentLoaded", function() {
  document.frm.uid.addEventListener("blur", function() {
    let uid = document.getElementById("uid").value;
    if(uid.length < 4) {
      document.getElementById("idError-message").textContent = "id는 4글자 이상이어야 합니다.";
      return false;
    } else {
      document.getElementById("idError-message").textContent = "";
    }
  });

  document.frm.upw_check.addEventListener("blur", function() {
    let upw = document.getElementById("upw").value;
    let upw_check = document.getElementById("upw_check").value;

    const pwErrorMessage = document.getElementById("pwError-message");
    if (upw !== upw_check) {
      pwErrorMessage.textContent = "비밀번호와 비밀번호 확인이 일치하지 않습니다.";
    } else {
      pwErrorMessage.textContent = "";
    }
  });
});

function loginCheck() {
  const uid = document.getElementById("uid").value;
  const upw = document.getElementById("upw").value;
  if(document.frm.uid.value.length == 0) {
    alert("아이디를 써주세요.");
    document.frm.uid.focus();
    return false;
  }
  if(document.frm.pwd.value == "") {
    alert("암호는 반드시 입력해야 합니다.");
    document.frm.pwd.focus();
    return false;
  }
  return true;
}


const validateForm = () => {
  let userid = document.frm.userid.value;
  let upw = document.frm.upw.value;
  let uname = document.frm.uname.value;
  let gender = document.frm.gender.value;

  if(userid === "" || upw === "" || uname === "" || gender === "") {
    alert("필수 항목을 입력해주세요.");
    return false;
  }
  document.frm.submit();
  return true;
}

const idCheck = function() {
  if(document.frm.userid.value == "") {
    alert('아이디를 입력하여 주십시오.');
    document.frm.userid.focus();
    return;
  }
  let url = "IdCheck.do?userid=" + document.frm.userid.value;
  window.open(url, "idCheck",
      "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}


const idOk = function() {
  if (!opener) {
    alert("부모 창과의 연결이 끊어졌습니다. 팝업을 닫고 다시 시도해주세요.");
    return;
  }
  opener.frm.checkid.value = document.frm.userid.value;
  if (opener.frm && opener.frm.userid) {
    opener.frm.userid.value = document.frm.userid.value;
  } else {
    console.error("부모창에 frm 폼 또는 userid 입력 필드가 없습니다.");
  }
  self.close();
}
