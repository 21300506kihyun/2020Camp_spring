package com.blogtest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.blogtest.dto.UserListResponseDTO;

@Repository("userListDAO")
public class UserListDAOImpl implements UserListDAO{

	@Override
	public List<UserListResponseDTO> getUserListdao() {
		// TODO Auto-generated method stub
		System.out.println("dao call");
		
		//����Ʈ�� �����.//
		List<UserListResponseDTO> userlist = new ArrayList<UserListResponseDTO>();
		
		//�� ������ �л��� �����.//
		UserListResponseDTO list = new UserListResponseDTO();
		list.setUserName("ȫ�浿");
		list.setUserAge("27");
		list.setUserAddress("��⵵");
		list.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list);
		
		UserListResponseDTO list2 = new UserListResponseDTO();
		list2.setUserName("�Ӳ���");
		list2.setUserAge("27");
		list2.setUserAddress("�뱸 ������");
		list2.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list2);
		
		UserListResponseDTO list3 = new UserListResponseDTO();
		list3.setUserName("�̱���");
		list3.setUserAge("27");
		list3.setUserAddress("����õ");
		list3.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list3);
		return userlist;
	}

}
