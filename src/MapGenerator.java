import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
		public int[][] map;
		public int brickwidth;
		public int brickheigth;
		public MapGenerator(int row, int col) {
			map =new int[row][col]; 
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[0].length;j++) {
					map[i][j]=1;
				}
			}
			brickwidth= 540/col;
			brickheigth=150/row;
		}
		public void Draw(Graphics2D g) {
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[0].length;j++) {
					if(map[i][j]>0) {
						g.setColor(Color.WHITE);
						g.fillRect(j*brickwidth +80, i* brickheigth+50,brickwidth, brickheigth);
						
						
						g.setStroke(new BasicStroke(3));
						g.setColor(Color.black);
						g.drawRect(j*brickwidth +80, i* brickheigth+50,brickwidth, brickheigth);
					}
				}
			}
			
			
			
		}
		
		public void setBrickValue(int value, int row, int col) {
			map[row][col]=value;
		}
		
		
		
		
}
