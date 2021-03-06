
package org.apereo.cas;

import org.apereo.cas.adaptors.ldap.services.LdapContinuousIntegrationServiceRegistryTests;
import org.apereo.cas.adaptors.ldap.services.LdapServiceRegistryTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    LdapServiceRegistryTests.class,
    LdapContinuousIntegrationServiceRegistryTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
