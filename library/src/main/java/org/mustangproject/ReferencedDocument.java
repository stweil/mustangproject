package org.mustangproject;

import org.mustangproject.ZUGFeRD.IReferencedDocument;

public class ReferencedDocument implements IReferencedDocument {

	String issuerAssignedID;
	String typeCode;
	String referenceTypeCode;

	public ReferencedDocument(String issuerAssignedID, String typeCode, String referenceTypeCode) {
		this.issuerAssignedID = issuerAssignedID;
		this.typeCode = typeCode;
		this.referenceTypeCode = referenceTypeCode;
	}

	public ReferencedDocument(String issuerAssignedID, String referenceTypeCode) {
		this.issuerAssignedID = issuerAssignedID;
		this.typeCode = "916"; // additional invoice related document
		this.referenceTypeCode = referenceTypeCode;
	}

	/***
	 * sets an ID assigned by the sender
	 * @param issuerAssignedID
	 */
	public void setIssuerAssignedID(String issuerAssignedID) {
		this.issuerAssignedID = issuerAssignedID;
	}

	/**
	 * which type is the document? e.g. "916" for additional invoice related
	 * @param typeCode
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * type of the reference of this line, a UNTDID 1153 code
	 * @param referenceTypeCode
	 */
	public void setReferenceTypeCode(String referenceTypeCode) {
		this.referenceTypeCode = referenceTypeCode;
	}

	@Override
	public String getIssuerAssignedID() {
		return issuerAssignedID;
	}

	@Override
	public String getTypeCode() {
		return typeCode;
	}

	@Override
	public String getReferenceTypeCode() {
		return referenceTypeCode;
	}
}
