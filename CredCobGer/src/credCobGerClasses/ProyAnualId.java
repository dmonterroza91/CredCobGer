package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProyAnualId generated by hbm2java
 */
@Embeddable
public class ProyAnualId implements java.io.Serializable {

	private int anho;
	private String codigoRubro;

	public ProyAnualId() {
	}

	public ProyAnualId(int anho, String codigoRubro) {
		this.anho = anho;
		this.codigoRubro = codigoRubro;
	}

	@Column(name = "ANHO", nullable = false)
	public int getAnho() {
		return this.anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	@Column(name = "CODIGO_RUBRO", nullable = false, length = 2)
	public String getCodigoRubro() {
		return this.codigoRubro;
	}

	public void setCodigoRubro(String codigoRubro) {
		this.codigoRubro = codigoRubro;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProyAnualId))
			return false;
		ProyAnualId castOther = (ProyAnualId) other;

		return (this.getAnho() == castOther.getAnho())
				&& ((this.getCodigoRubro() == castOther.getCodigoRubro()) || (this
						.getCodigoRubro() != null
						&& castOther.getCodigoRubro() != null && this
						.getCodigoRubro().equals(castOther.getCodigoRubro())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAnho();
		result = 37
				* result
				+ (getCodigoRubro() == null ? 0 : this.getCodigoRubro()
						.hashCode());
		return result;
	}

}