/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.drone.webdriver;

import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.arquillian.drone.spi.Configurator;
import org.jboss.arquillian.drone.spi.Destructor;
import org.jboss.arquillian.drone.spi.Instantiator;
import org.jboss.arquillian.drone.webdriver.factory.AndroidDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.ChromeDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.FirefoxDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.HtmlUnitDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.IPhoneDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.InternetExplorerDriverFactory;
import org.jboss.arquillian.drone.webdriver.factory.WebDriverFactory;

/**
 * Arquillian Drone support for WebDriver
 *
 * @author <a href="kpiwko@redhat.com>Karel Piwko</a>
 *
 */
public class DroneWebDriverExtension implements LoadableExtension {
    public void register(ExtensionBuilder builder) {

        builder.service(Configurator.class, AndroidDriverFactory.class);
        builder.service(Instantiator.class, AndroidDriverFactory.class);
        builder.service(Destructor.class, AndroidDriverFactory.class);

        builder.service(Configurator.class, ChromeDriverFactory.class);
        builder.service(Instantiator.class, ChromeDriverFactory.class);
        builder.service(Destructor.class, ChromeDriverFactory.class);

        builder.service(Configurator.class, FirefoxDriverFactory.class);
        builder.service(Instantiator.class, FirefoxDriverFactory.class);
        builder.service(Destructor.class, FirefoxDriverFactory.class);

        builder.service(Configurator.class, HtmlUnitDriverFactory.class);
        builder.service(Instantiator.class, HtmlUnitDriverFactory.class);
        builder.service(Destructor.class, HtmlUnitDriverFactory.class);

        builder.service(Configurator.class, InternetExplorerDriverFactory.class);
        builder.service(Instantiator.class, InternetExplorerDriverFactory.class);
        builder.service(Destructor.class, InternetExplorerDriverFactory.class);

        builder.service(Configurator.class, IPhoneDriverFactory.class);
        builder.service(Instantiator.class, IPhoneDriverFactory.class);
        builder.service(Destructor.class, IPhoneDriverFactory.class);

        builder.service(Configurator.class, WebDriverFactory.class);
        builder.service(Instantiator.class, WebDriverFactory.class);
        builder.service(Destructor.class, WebDriverFactory.class);
    }
}