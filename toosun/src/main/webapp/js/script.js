$(function(){
    $(".hero>div").mouseenter(function(){
        $(this).find(".character").stop().fadeIn();
    });
    $(".hero>div").mouseleave(function(){
        $(this).find(".character").stop().fadeOut();
    })
})

$(function(){
    setInterval(mySlide,3000);

});

function mySlide(){
    $('.do-slide').animate({
        'left': '-300px'
    },500, function(){
        //슬라이드인 안에 있는 첫번째 이미지를 복제해서(clone) 슬라이드인의 뒤에 붙여라(appendTo)
        $('.do-slide img:first-child')
        .clone().appendTo('.do-slide');
        $('.do-slide img:first-child').remove();
        $('.do-slide').css('left',0);
    });
    }

// function fadeInOut(){
//     $('.do-slide img:eq(0)')
//     .fadeOut(300)
//     .next()
//     .fadeIn(300)
//     .end()
//     .appendTo('.do-slide'); 
// }

function sPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var address = ''; // 주소 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    address = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    address = data.jibunAddress;
                }
                var extraRoadAddr = ""; //참고항목 
                //도로명에 동,로,가가 있는 경우 추가
                if(data.bname !== '' &&/[동|로|가]$/g.test(data.bname)){
               extraRoadAddr += data.bname;
            }
            //건물명, 공동주택 추가
            if(data.bname !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== ''?','+data.buildingName : data.buildingName);
            }
                //표시할 참고항목이 있을 경우
                if(extraRoadAddr !== ''){
               extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

                 // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("addr").value = address;
                document.getElementById("addr").value += extraRoadAddr;
                // 커서를 상세주소 필드로 이동한다.
                //document.getElementById("detailaddr").focus();
            }
        }).open();
}