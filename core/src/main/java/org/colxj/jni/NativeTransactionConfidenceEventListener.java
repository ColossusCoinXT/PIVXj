/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.colxj.jni;

import org.colxj.core.listeners.TransactionConfidenceEventListener;
import org.colxj.wallet.Wallet;
import org.colxj.core.Transaction;

/**
 * An event listener that relays events to a native C++ object. A pointer to that object is stored in
 * this class using JNI on the native side, thus several instances of this can point to different actual
 * native implementations.
 */
public class NativeTransactionConfidenceEventListener implements TransactionConfidenceEventListener {
    public long ptr;

    @Override
    public native void onTransactionConfidenceChanged(Wallet wallet, Transaction tx);
}
