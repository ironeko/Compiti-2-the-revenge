
public class Scuola {

	public String condiceAlfanumerico;
	public String denominazione;
	public String indirizzo;
	public String citt�;
	public int studenti;
	public int classi;
	public int sedi;
	public int laboratori;
	
	public Scuola(String condiceAlfanumerico, String denominazione, String indirizzo, String citt�, int studenti,
			int classi, int sedi, int laboratori) {
		this.condiceAlfanumerico = condiceAlfanumerico;
		this.denominazione = denominazione;
		this.indirizzo = indirizzo;
		this.citt� = citt�;
		this.studenti = studenti;
		this.classi = classi;
		this.sedi = sedi;
		this.laboratori = laboratori;
	}

	public String getCondiceAlfanumerico() {
		return condiceAlfanumerico;
	}

	public void setCondiceAlfanumerico(String condiceAlfanumerico) {
		this.condiceAlfanumerico = condiceAlfanumerico;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitt�() {
		return citt�;
	}

	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}

	public int getStudenti() {
		return studenti;
	}

	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}

	public int getClassi() {
		return classi;
	}

	public void setClassi(int classi) {
		this.classi = classi;
	}

	public int getSedi() {
		return sedi;
	}

	public void setSedi(int sedi) {
		this.sedi = sedi;
	}

	public int getLaboratori() {
		return laboratori;
	}

	public void setLaboratori(int laboratori) {
		this.laboratori = laboratori;
	}

	@Override
	public String toString() {
		return "Scuola [condiceAlfanumerico=" + condiceAlfanumerico + ", denominazione=" + denominazione
				+ ", indirizzo=" + indirizzo + ", citt�=" + citt� + ", studenti=" + studenti + ", classi=" + classi
				+ ", sedi=" + sedi + ", laboratori=" + laboratori + "]";
	}
	
}
