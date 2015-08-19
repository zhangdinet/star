package com.star.demo.mock;

import org.junit.Before;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by zhangdi on 2015/8/19.
 */

public class UserServiceTest {
    @Mock
    IUserService userService;

    @Before
    public void ininMethod() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindUserByName() {

        Mockito.when(userService.findUserByName("zhangdi")).thenReturn(new User("zhangdi", 26));
        User user = userService.findUserByName("zhangdi");
        System.out.println(user);

        Mockito.verify(userService, Mockito.atLeastOnce()).findUserByName("zhangdi");
        Mockito.verify(userService, Mockito.never()).findUserByName("zhangsan");
        //Mockito.verify(userService,Mockito.never()).findUserByName("zhangdi");
    }
}
