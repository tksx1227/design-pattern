package Builder;

enum Material { WOOD, CLAY, CONCRETE, SNOW }

// Builder の抽象クラス
interface Builder {
	void buildBase();
	void buildFrame();
	void buildWall();
	Building getResult();
}

// 建物を表すクラス
class Building {
	private Material base;
	private Material frame;
	private Material wall;

	void setBase(Material m) {
		this.base = m;
	}

	void setFrame(Material m) {
		this.frame = m;
	}

	void setWall(Material m) {
		this.wall = m;
	}

	public String toString() {
		return "[Base:" + this.base + ", Frame:" + this.frame + ", Wall:" + this.wall + "]";
	}
}

// Builder の具象クラス１
class JapaneseHouseBuilder implements Builder {
	private Building building;

	JapaneseHouseBuilder() {
		this.building = new Building();
	}

	public void buildBase() {
		this.building.setBase(Material.CONCRETE);
	}

	public void buildFrame() {
		this.building.setFrame(Material.WOOD);
	}

	public void buildWall() {
		this.building.setWall(Material.CLAY);
	}

	public Building getResult() {
		return this.building;
	}
}

//Builder の具象クラス２
class KamakuraBuilder implements Builder {
	private Building building;

	KamakuraBuilder() {
		this.building = new Building();
	}

	public void buildBase() {
		this.building.setBase(Material.SNOW);
	}

	public void buildFrame() {
		this.building.setFrame(Material.SNOW);
	}

	public void buildWall() {
		this.building.setWall(Material.SNOW);
	}

	public Building getResult() {
		return this.building;
	}
}
