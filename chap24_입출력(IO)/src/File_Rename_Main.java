import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String originFile ="C:\\Users\\user1\\Desktop\\cute.png";
		
		String newFile = "C:\\Users\\user1\\Desktop\\cute2222.png";
		
		String mainPath = "C:\\Users\\user1\\Desktop";
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//파일 이름 변경하기
		if(currentFile.renameTo(renameFile)) {
			System.out.println("파일 이름 변경 성공");
		}else {
			System.out.println("파일 이름 변경 실패");
		}
	}

}
