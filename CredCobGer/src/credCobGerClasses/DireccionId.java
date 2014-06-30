package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DireccionId generated by hbm2java
 */
@Embeddable
public class DireccionId implements java.io.Serializable {

	private String codigoAs;
	private int numCorDir;

	public DireccionId() {
	}

	public DireccionId(String codigoAs, int numCorDir) {
		this.codigoAs = codigoAs;
		this.numCorDir = numCorDir;
	}

	@Column(name = "CODIGO_AS", nullable = false, length = 7)
	public String getCodigoAs() {
		return this.codigoAs;
	}

	public void setCodigoAs(String codigoAs) {
		this.codigoAs = codigoAs;
	}

	@Column(name = "NUM_COR_DIR", nullable = false)
	public int getNumCorDir() {
		return this.numCorDir;
	}

	public void setNumCorDir(int numCorDir) {
		this.numCorDir = numCorDir;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DireccionId))
			return false;
		DireccionId castOther = (DireccionId) other;

		return ((this.getCodigoAs() == castOther.getCodigoAs()) || (this
				.getCodigoAs() != null && castOther.getCodigoAs() != null && this
				.getCodigoAs().equals(castOther.getCodigoAs())))
				&& (this.getNumCorDir() == castOther.getNumCorDir());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodigoAs() == null ? 0 : this.getCodigoAs().hashCode());
		result = 37 * result + this.getNumCorDir();
		return result;
	}

}