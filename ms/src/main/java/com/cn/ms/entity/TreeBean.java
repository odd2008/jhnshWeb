package com.cn.ms.entity;
import java.io.Serializable;
//ztree外部组织需要的字段
public class TreeBean implements Serializable{

	private static final long serialVersionUID = 1L;
    //组织id
	private String id;
	//上级组织id
	private String pId;
	//组织名
	private String name;
	//是否是父节点
	private boolean isParent;

	public boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OrgTreeBean [id=" + id + ", pId=" + pId + ", name=" + name + "]";
	}
	
	
	
}

