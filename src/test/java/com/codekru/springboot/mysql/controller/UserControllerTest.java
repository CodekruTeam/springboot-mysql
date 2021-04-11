package com.codekru.springboot.mysql.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.codekru.springboot.mysql.entity.User;
import com.codekru.springboot.mysql.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;
    @Mock
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("codekru2020");
        user.setFirstName("codekru");
        user.setLastName("blog");
        user.setEmail("admin@codekru.com");
        when(userService.addUser(user)).thenReturn(user);
        User actualUser = userController.addUser(user);
        assertNotNull(actualUser);
        assertEquals("codekru2020", actualUser.getUsername());
        verify(userService).addUser(user);
    }

    @Test
    public void testGetUsers() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("codekru2020");
        user.setFirstName("codekru");
        user.setLastName("blog");
        user.setEmail("admin@codekru.com");
        List<User> users = new ArrayList<>();
        users.add(user);
        when(userService.getUsers()).thenReturn(users);
        List<User> actualUsers = userController.getUsers();
        assertNotNull(actualUsers);
        User actualUser = actualUsers.get(0);
        assertNotNull(actualUser);
        assertEquals("codekru2020", actualUser.getUsername());
        verify(userService).getUsers();
    }

}
