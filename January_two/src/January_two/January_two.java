package January_two;

import java.util.Scanner;

public class January_two {
//	�α��� ���μ����� Ȱ���ؼ� ���� �� ���ǹ� Ȱ��� 
//	1. ����ڰ� ���̵�� ��й�ȣ �Է� 
//	2. �Է��� ���̵�� ��й�ȣ�� ��� �Էµƴ��� ���� 
//	2-1. ���� �ϳ��� ���� �ִٸ� '��� �Է��ϼ���.' ��� �� ���α׷� ���� 
//	3. �޸𸮿� ����� ���̵�� ��й�ȣ�� Ȯ��
//	3-1. ���� �ϳ��� Ʋ���ٸ� '�α��� ������ ��ġ���� �ʽ��ϴ�' ��� �� ���α׷� ���� 
//	3-2 ��� �´ٸ� '�α��ο� �����Ͽ����ϴ�' ��� �� ���΃E ���� 
	public static void main(String[] args) {
//		�޸𸮿� ����Ǵ� ID�� PASSWORD
		final String ID = "Java"; //���ϸ� �ȵǴ� ��� �̹Ƿ� final �ٿ��ش�
		final String PASSWORD = "qwer1234";
		
//		1. ����ڰ� ���̵�� ��й�ȣ �Է� 
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;
		
		System.out.println("���̵� �Է��ϼ���.: ");
		id = sc.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���.: ");
		pw = sc.nextLine();
		
		System.out.println("id: "+ id+"    "+"pw: "+pw);
		
		
//		2. �Է��� ���̵�� ��й�ȣ�� ��� �Էµƴ��� ���� 
//		�Է��� ���� �ʾ��� �� ���ڿ��� "" 
			
		
//		2-1. ���� �ϳ��� ���� �ִٸ� '��� �Է��ϼ���.' ��� �� ���α׷� ���� 
		if(id.equals("") || pw=="") {
			System.out.println("��� �Է��ϼ��� ");
//			main method ����
			return;
		}
		
//		3. �޸𸮿� ����� ���̵�� ��й�ȣ�� Ȯ��
		
//		3-1. ���� �ϳ��� Ʋ���ٸ� '�α��� ������ ��ġ���� �ʽ��ϴ�' ��� �� ���α׷� ���� 
		if(!id.equals(ID) ||  !pw.equals(PASSWORD)) {
			System.out.println("�α��� ������ ��ġ���� �ʽ��ϴ�.");
			return;
		}
		
//		3-2 ��� �´ٸ� '�α��ο� �����Ͽ����ϴ�' ��� �� ���΃E ���� 
		if(id.equals(ID) && pw.equals(PASSWORD)) {
			System.out.println("�α��ο� �����߽��ϴ�");
			return;
			
		}

	}

}
