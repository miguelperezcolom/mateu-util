package io.mateu.util.interfaces;

import java.util.List;

public interface UserPrincipal {

    String getLogin();

    List<Long> getPermissionIds();

    String getName();

    String getEmail();

    IResource getPhoto();
}
