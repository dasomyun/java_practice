package api01.System;

//��ü ���� (������ ȣ��) -- �۾��� �Ѵ� -- ��ü �Ҹ�(�Ҹ��� ȣ��) -- GC �Ҹ�

public class BFinalize {//(extends Object)�������� 	
	public int eno;
	
	public BFinalize(int eno){		//������
		this.eno = eno;
		System.out.println(eno + " : �޸𸮿��� ����");
	}

	@Override
	protected void finalize() throws Throwable {	//�Ҹ���
		System.out.println(eno + " : �޸𸮿��� �Ҹ�");
	}

}
