/**
 * 
 */
package com.older.manager.bean;

/**
 * @author ym
 *
 */
public class OldManRelativesShow extends Relatives {
	
	
	private Oldman oldman;

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}

	@Override
	public String toString() {
		return "OldManRelativesShow [oldman=" + oldman + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getSex()=" + getSex()
				+ ", getPhone()=" + getPhone() + ", getRelation()="
				+ getRelation() + ", getIslive()=" + getIslive()
				+ ", getAddress()=" + getAddress() + ", getOldmanId()="
				+ getOldmanId() + ", getNumone()=" + getNumone()
				+ ", getNumtwo()=" + getNumtwo() + ", getNumthree()="
				+ getNumthree() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

	
	
	

}
