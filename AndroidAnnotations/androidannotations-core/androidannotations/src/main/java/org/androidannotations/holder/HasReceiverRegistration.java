/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 * Copyright (C) 2016-2017 the AndroidAnnotations project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.holder;

import org.androidannotations.holder.ReceiverRegistrationDelegate.IntentFilterData;

import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JFieldVar;

public interface HasReceiverRegistration extends HasSimpleLifecycleMethods {

	IJExpression getContextRef();

	JFieldVar getIntentFilterField(IntentFilterData intentFilterData);

	JBlock getIntentFilterInitializationBlock(IntentFilterData intentFilterData);
}
