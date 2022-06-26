package com.pawel;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class UserManager {
    List<User> users = new ArrayList<>();

    public List<User> getAdmins() {
        return users.stream()
                .filter(user -> user.isAdmin())
                .collect(Collectors.toList());
    }

    public int getMaxScore(){
        return users.stream()
                .max(Comparator.comparing(User::getScore))
                .orElseThrow().getScore();
    }
}