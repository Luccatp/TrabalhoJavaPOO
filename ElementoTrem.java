public abstract class ElementoTrem {

	private int id;
	private Trem trem;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Trem getTrem() {
		return trem;
	}

	public boolean livre() {
		if (this.trem != null)
			return false;
		else
			return true;
	}

	public void setTrem(Trem trem) {
		this.trem = trem;
	}

	public abstract String toString();
}