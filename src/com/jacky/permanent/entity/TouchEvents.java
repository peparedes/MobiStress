package com.jacky.permanent.entity;

import com.lidroid.xutils.db.annotation.Table;

/**
 * ��ȡ��Ļ����������ʱ��
 * 
 * @author zhangyuhua
 * 
 */
@Table(name = "TouchEvents")
public class TouchEvents {

	private int _id;
	private String coordinateX; // x������
	private String coordinateY;// y������
	private String dateStr;// ʱ��
	private String pressure;// ѹ��

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
	}

	public String getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}

}
