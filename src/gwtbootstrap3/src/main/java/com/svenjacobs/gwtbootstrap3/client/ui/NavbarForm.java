package com.svenjacobs.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 Sven Jacobs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.svenjacobs.gwtbootstrap3.client.ui.base.form.AbstractForm;
import com.svenjacobs.gwtbootstrap3.client.ui.base.mixin.PullMixin;
import com.svenjacobs.gwtbootstrap3.client.ui.constants.Pull;
import com.svenjacobs.gwtbootstrap3.client.ui.constants.Styles;

/**
 * @author Sven Jacobs
 * @see Navbar
 */
public class NavbarForm extends AbstractForm implements HasPull {

    private final PullMixin<NavbarForm> pullMixin = new PullMixin<NavbarForm>(this);

    public NavbarForm() {
        setStyleName(Styles.NAVBAR_FORM);
    }

    @Override
    public void setPull(final Pull pull) {
        pullMixin.setPull(pull);
    }

    @Override
    public Pull getPull() {
        return pullMixin.getPull();
    }
}
