package creational.builder;

public class Text {
	private String displayValue;
	private String font;
	private String color;
	private String decoration;

	private Text(Builder builder) {
		this.displayValue = builder.displayValue;
		this.font = builder.font;
		this.color = builder.color;
		this.decoration = builder.decoration;
	}

	static class Builder {
		private String displayValue;
		private String font;
		private String color;
		private String decoration;

		public Builder displayValue(String dValue) {
			this.displayValue = dValue;
			return this;
		}

		public Builder font(String fontName) {
			this.font = fontName;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder decoration(String decor) {
			this.decoration = decor;
			return this;
		}

		public Text build() {
			Text text = new Text(this);
			return text;
		}
	}

	@Override
	public String toString() {
		return "Text{" + "displayValue=" + displayValue + ", font=" + font + ", color=" + color + ", decoration="
				+ decoration + '}';
	}

}