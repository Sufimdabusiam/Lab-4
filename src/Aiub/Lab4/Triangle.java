package Aiub.Lab4;


public class Triangle {
		private int x;
		private int y;
		private int z;
		
		public Triangle() {
			
		}
		public Triangle(int x,int y,int z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x=x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y=y;
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z=z;
		}
		public void show() {
			System.out.println("X="+x+"Y="+y+"Z="+z);
		}
		@Override
		public String toString() {
			return "Triangle [x=" + x + ", y=" + y + ", z=" + z + "]";
		}
		
}
