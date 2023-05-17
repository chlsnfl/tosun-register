<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" %>
<jsp:include page="/include/header.jsp"></jsp:include>
<style>
        .container{
            width: 500px;
            margin: 30px auto;
            background: #eee;
        }
        h1{
            text-align: center;
            padding-top: 10px;
        }
        h2{
            text-align: center;
        }
        label{
            display: block;
        }
        .block{
            margin-left: 30px;
            margin-right: 30px;
            font-size: 20px;
            margin-bottom: 15px;
        }
        input{
            width: 100%;
            height: 30px;
            font-size: 20px;
        }
        .ok{
            text-align: center;
        }
        .ok button{
            margin: 5px;
            padding: 5px 10px;
        }
        #postcode{
            width: 80%;
        }
        .find{
            padding: 5px 20px;
        }
</style>
    <div class="container">
        <h1>Tosun 회원가입</h1>
        <form action="">
            <div class="block">
                <label for="username">이름</label>
                <input type="text" name="username" id="username">
            </div>
            <div class="block">
                <label for="userid">아이디</label>
                <input type="text" name="userid" id="userid">
            </div>
            <div class="block">
                <label for="userpass">비밀번호</label>
                <input type="password" name="userpass" id="userpass">
            </div>
            <div class="block">
                <label for="reuserpass">비밀번호 확인</label>
                <input type="password" name="reuserpass" id="reuserpass">
            </div>
            <div class="block">
                <label for="email">이메일</label>
                <input type="email" name="email" id="email">
            </div>
            <div class="block">
                <label for="tel">전화번호</label>
                <input type="tel" name="tel" id="tel">
            </div>
            <div class="block">
                <label for="postcode">우편번호</label>
                <input type="number" name="postcode" id="postcode">
                <button class="find" type="button" onclick="sPostcode()">찾기</button>
            </div>
            <div class="block">
                <label for="addr">주소</label>
                <input type="text" name="addr" id="addr">
            </div>
                <div class="block">
                <label for="detailaddr">상세주소</label>
            <input type="text" name="detailaddr" id="detailaddr">
            </div>
            <div class="block">
                <label for="birth">생일</label>
                <input type="number" name="birth" id="birth">
            </div>
            <div class="ok">
            <button type="reset">초기화</button>
            <button type="submit">회원가입</button>
            </div>
        </form>
    </div>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<jsp:include page="/include/footer.jsp"></jsp:include>
