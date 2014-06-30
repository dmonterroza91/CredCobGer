package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TelefonoId generated by hbm2java
 */
@Embeddable
public class TelefonoId implements java.io.Serializable {

	private String codigoAs;
	private int numCor;

	public TelefonoId() {
	}

	public TelefonoId(String codigoAs, int numCor) {
		this.codigoAs = codigoAs;
		this.numCor = numCor;
	}

	@Column(name = "CODIGO_AS", nullable = false, length = 7)
	public String getCodigoAs() {
		return this.codigoAs;
	}

	public void setCodigoAs(String codigoAs) {
		this.codigoAs = codigoAs;
	}

	@Column(name = "NUM_COR", nullable = false)
	public int getNumCor() {
		return this.numCor;
	}

	public void setNumCor(int numCor) {
		this.numCor = numCor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TelefonoId))
			return false;
		TelefonoId castOther = (TelefonoId) other;

		return ((this.getCodigoAs() == castOther.getCodigoAs()) || (this
				.getCodigoAs() != null && castOther.getCodigoAs() != null && this
				.getCodigoAs().equals(castOther.getCodigoAs())))
				&& (this.getNumCor() == castOther.getNumCor());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodigoAs() == null ? 0 : this.getCodigoAs().hashCode());
		result = 37 * result + this.getNumCor();
		return result;
	}

}