package javaJarTest;

public class HomeString {

	public static void main(String[] args) {
        // Java�ļ���
		String fileName = "HelloWorld.java"; 
        // ����
		String email = "laurenyang@imooc.com";
		
		// �ж�.java�ļ����Ƿ���ȷ���Ϸ����ļ���Ӧ����.java��β

        //��ȡ�ļ��������һ�γ���"."�ŵ�λ��
		int index = fileName.indexOf(".");
        
        // ��ȡ�ļ��ĺ�׺
		String prefix =fileName.substring(index+1);
		System.out.println("index="+index);
		System.out.println("prefix="+prefix);
		// �жϱ������"."�ţ��Ҳ��ܳ�������λ��ͬʱ��׺��Ϊ"java"
//		if (index>1 && prefix=="java") {  //ע�⣺==һ��Ϊfalse����Ϊ�Ƚϵ��Ƕ������ã��Ƚ�ֵ����equals
		if (index!=-1 && index>1 && prefix.equals("java")){
			System.out.println("Java�ļ�����ȷ");
		} else {
			System.out.println("Java�ļ�����Ч");
		}

        // �ж������ʽ�Ƿ���ȷ���Ϸ���������������Ҫ����"@", ����"@"����"."֮ǰ

	    // ��ȡ������"@"���ŵ�λ��
		int index2 = email.indexOf("@");
        
        // ��ȡ������"."�ŵ�λ��
		int index3 = email.indexOf('.');
        
		// �жϱ������"@"���ţ���"@"������"."֮ǰ
		if (index2 != -1 && index3 > index2) {
			System.out.println("�����ʽ��ȷ");
		} else {
			System.out.println("�����ʽ��Ч");
		}
	}
}