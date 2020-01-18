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
		
		//리스트를 만든다.//
		List<UserListResponseDTO> userlist = new ArrayList<UserListResponseDTO>();
		
		//총 세명의 학생을 만든다.//
		UserListResponseDTO list = new UserListResponseDTO();
		list.setUserName("홍길동");
		list.setUserAge("27");
		list.setUserAddress("경기도");
		list.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list);
		
		UserListResponseDTO list2 = new UserListResponseDTO();
		list2.setUserName("임꺽정");
		list2.setUserAge("27");
		list2.setUserAddress("대구 광역시");
		list2.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list2);
		
		UserListResponseDTO list3 = new UserListResponseDTO();
		list3.setUserName("이기현");
		list3.setUserAge("27");
		list3.setUserAddress("동두천");
		list3.setUserImage("https://cdn.pixabay.com/photo/2020/01/14/13/53/oldtimer-4765102__340.jpg");
		
		userlist.add(list3);
		return userlist;
	}

}
