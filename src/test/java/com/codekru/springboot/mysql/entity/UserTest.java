package com.codekru.springboot.mysql.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserTest {

    @Test
    public void testUserEntity() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("codekru2020");
        user.setFirstName("codekru");
        user.setLastName("blog");
        user.setEmail("admin@codekru.com");
        assertNotNull(user);
        assertEquals(Long.valueOf(1), user.getUserId());
        assertEquals("codekru2020", user.getUsername());
        assertEquals("codekru", user.getFirstName());
        assertEquals("blog", user.getLastName());
        assertEquals("admin@codekru.com", user.getEmail());
    }

    @Test
    public void testUserHashcodeEquals() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("codekru2020");
        user.setFirstName("codekru");
        user.setLastName("blog");
        user.setEmail("admin@codekru.com");
        User user1 = new User();
        user1.setUserId(1L);
        user1.setUsername("codekru2020");
        user1.setFirstName("codekru");
        user1.setLastName("blog");
        user1.setEmail("admin@codekru.com");
        assertEquals(user.hashCode(), user1.hashCode());
        assertEquals(user, user1);
    }

    @Test
    public void testUserToString() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("codekru2020");
        user.setFirstName("codekru");
        user.setLastName("blog");
        user.setEmail("admin@codekru.com");
        assertEquals("User [userId=1, username=codekru2020, firstName=codekru, lastName=blog, email=admin@codekru.com]",
                user.toString());
    }

}
