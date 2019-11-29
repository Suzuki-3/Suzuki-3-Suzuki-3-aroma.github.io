import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAROMASample {

	public static void main(String[] args) {

		//データベースに接続

		try(Connection conn = DriverManager.getConnection("jdbc:h2:~/aroma","sa","")){

			//SELECT文を準備
			String sql = "SELECT ID, NAME, DESCRIPTION_TITLE, DESCRIPTION,SMELL_TITLE, SMELL, HEART_TITLE, HEART, BODY_TITLE, BODY,SKIN_TITLE,SKIN,RECOMMEND_TITLE,RECOMMEND,ATTENTION_TITLE,ATTENTION,PICTURE FROM AROMA";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECT文を実行し、結果表（ResultSet）を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容を表示
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				String desriptionTitle = rs.getString("DESCRIPTION_TITLE");
				String description = rs.getString("DESCRIPTION");
				String smellTitle = rs.getString("SMELL_TITLE");
				String smell = rs.getString("SMELL");
				String heartTitle = rs.getString("HEART_TITLE");
				String heart = rs.getString("HEART");
				String bodyTitle = rs.getString("BODY_TITLE");
				String body = rs.getString("BODY");
				String skinTitle = rs.getString("SKIN_TITLE");
				String skin = rs.getString("SKIN");
				String recommendTitle = rs.getString("RECOMMEND_TITLE");
				String recommend = rs.getString("RECOMMEND");
				String attentionTitle = rs.getString("ATTENTION_TITLE");
				String attention = rs.getString("ATTENTION");
				String picture = rs.getString("PICTURE");


				//取得したデータを出力
				System.out.println("ID：" + id);
				System.out.println("NAME：" + name);
				System.out.println("説明文タイトル：" + desriptionTitle);
				System.out.println("説明文：" + description);
				System.out.println("香りタイトル：" + smellTitle);
				System.out.println("香り詳細：" + smell );
				System.out.println("心への効能タイトル：" + heartTitle);
				System.out.println("心への効能：" + heart);
				System.out.println("身体への効能タイトル：" + bodyTitle);
				System.out.println("身体への効能：" + body);
				System.out.println("肌への効能タイトル：" + skinTitle);
				System.out.println("肌への効能：" + skin);
				System.out.println("お勧めブレンドタイトル：" + recommendTitle);
				System.out.println("お勧めブレンド：" + attention);
				System.out.println("写真：" + picture);


			}
		}catch(SQLException e) {
			e.printStackTrace();

		}
	}

}
