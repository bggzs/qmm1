function Loginqmm(){
	var act="0416160325";
	$.ajax({
		type: "POST",
		url:"./Loginqmm",
		data:{
			"key1" : act
		},
		success:function(massge){
			
			var obj=eval(massge);
			var classList=new Array();
			  var count=0;
			  for(var key in obj[0]){

			    if(key!=="time"){

			      classList[count]=new Array(10);
			      for(var j=0;j<10;j++){
			        classList[count][j]=obj[j][key];

			      }
			      count++;

			    }

			  }
			  
			  var week = window.innerWidth > 360 ? ['周一', '周二', '周三', '周四', '周五'] :
				    ['一', '二', '三', '四', '五'];
				  var day = new Date().getDay();
				  var courseType = [
				    [{index: '1', name: '8:30'}, 1],
				    [{index: '2', name: '9:30'}, 1],
				    [{index: '3', name: '10:30'}, 1],
				    [{index: '4', name: '11:30'}, 1],
				    [{index: '5', name: '12:30'}, 1],
				    [{index: '6', name: '14:30'}, 1],
				    [{index: '7', name: '15:30'}, 1],
				    [{index: '8', name: '16:30'}, 1],
				    [{index: '9', name: '17:30'}, 1],
				    [{index: '10', name: '18:30'}, 1]
				    
				  ];
				  // 实例化(初始化课表)
				  var Timetable = new Timetables({
				    el: '#coursesTable',
				    timetables: classList,
				    week: week,
				    timetableType: courseType,
				    highlightWeek: day,
				    gridOnClick: function (e) {
				      alert(e.name + '  ' + e.week + ', 第' + e.index + '节课, 课长' + e.length + '节');
				      console.log(e);
				    },
				    styles: {
				      Gheight: 50
				    }
				  });
		}

	});
	
}

function main() {
	var act="0416160325";
	document.getElementById('coursesTable').innerHTML="";
	$.ajax({
		type: "POST",
		url:"./Loginqmm1",
		data:{
			"key1" : act
		},
		success:function(massge){
			var obj=eval(massge);
			var classList=new Array();
			  var count=0;
			  for(var key in obj[0]){

			    if(key!=="time"){

			      classList[count]=new Array(10);
			      for(var j=0;j<10;j++){
			        classList[count][j]=obj[j][key];

			      }
			      count++;

			    }

			  }
			  
			  var week = window.innerWidth > 360 ? ['周一', '周二', '周三', '周四', '周五'] :
				    ['一', '二', '三', '四', '五'];
				  var day = new Date().getDay();
				  var courseType = [
				    [{index: '1', name: '8:30'}, 1],
				    [{index: '2', name: '9:30'}, 1],
				    [{index: '3', name: '10:30'}, 1],
				    [{index: '4', name: '11:30'}, 1],
				    [{index: '5', name: '12:30'}, 1],
				    [{index: '6', name: '14:30'}, 1],
				    [{index: '7', name: '15:30'}, 1],
				    [{index: '8', name: '16:30'}, 1],
				    [{index: '9', name: '17:30'}, 1],
				    [{index: '10', name: '18:30'}, 1]
				    
				  ];
				  // 实例化(初始化课表)
				  var Timetable = new Timetables({
				    el: '#coursesTable',
				    timetables: classList,
				    week: week,
				    timetableType: courseType,
				    highlightWeek: day,
				    gridOnClick: function (e) {
				      alert(e.name + '  ' + e.week + ', 第' + e.index + '节课, 课长' + e.length + '节');
				      console.log(e);
				    },
				    styles: {
				      Gheight: 50
				    }
				  });
		
			
		}

	});
	document.getElementById('zoushu').innerHTML="双周";
	
}





function main1() {
	document.getElementById('panel').innerHTML=`
		       <div class="panel panel-default">
                <!-- 面包屑 -->
                <a href="#" onclick="main()"><ol class="breadcrumb">
                    <li id="zoushu" value="1">单周</li>
                </ol></a>

               <div id="coursesTable"></div>    
            </div>
	`;
	Loginqmm();
}





