package com.service;

import com.model.Registration;
import java.util.List;

public interface RegistrationService {

    public void add(Registration registration);

    public List<Registration> listUser();
}
