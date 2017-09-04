$(function(){
	
	
	var setting = {	
			async:{
				enable: true,
				url: "tree",
				autoParam: ["id=id"],
				type: "post",
//				dataFilter: addNodes
			},
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pId",
					rootPId: ""
				}
			},
			
			callback:{
				onClick:function(event,treeId,treeNode){
					if(treeNode.isParent==false){
						window.open('edit?id='+treeNode.id,'newwindow', 'height='+screen.availHeight+', width='+screen.availWidth+', top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no')
					}
				}
		}
}
	$.fn.zTree.init($("#tree"),setting)
	
})