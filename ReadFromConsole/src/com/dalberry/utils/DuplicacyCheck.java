package com.dalberry.utils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.dalberry.exception.AccountCreationFailException;
import com.dalberry.model.User;
import com.dalberry.service.UserMap;

public class DuplicacyCheck {

	public static boolean checkDuplicacyOfEmail(User user) {
		Set<String> s = UserMap.getUserMap().keySet();

		for (Object keys : s) {
			if (keys.equals(user.getUserMandatoryDetail().getEmail())) {
				System.out.println("User with this email is Present");
				return true;
			} else {
				System.out.println("No duplicacy of Email Proceed");
				return false;
			}
		}
		return false;
	}

	public static boolean checkDuplicacyOfCurrency(User user) throws AccountCreationFailException {

		User alreadyexistuser = UserMap.getUserMap().get(user.getUserMandatoryDetail().getEmail());
		Set<String> keys = alreadyexistuser.getMap().keySet();
		Set<String> userEnteredKey = user.getMap().keySet();
		List<String> l = (List<String>) userEnteredKey.stream().collect(Collectors.toList());
		String userKey = l.get(0);
		System.out.println(userKey);

		if (keys.contains(userKey)) {
			System.out.println("user with this key is already present");
			return true;
		} else {
			System.out.println("user with this key is not Present");
			return false;
		}

	}
}
