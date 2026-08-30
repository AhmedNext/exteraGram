package com.exteragram.messenger.boost.encryption;

import org.telegram.messenger.MessageObject;

public class EncryptionHelper {
    public static String[] names = {"None"};

    public static boolean isEncrypted(String message) {
        return false;
    }

    public static boolean isEncrypted(MessageObject messageObject, Object obj) {
        return false;
    }

    public static MessageObject decryptMessage(MessageObject messageObject) {
        return messageObject;
    }

    public static MessageObject decryptMessage(MessageObject messageObject, Object messageGroup) {
        return messageObject;
    }

    public static BaseEncryptor getEncryptorBy(long dialogId) {
        return new BaseEncryptor();
    }

    public static int getEncryptorTypeFor(long dialogId) {
        return 0;
    }

    public static void setEncryptorTypeFor(long dialogId, int type) {
    }

    public static String encryptMessage(String message, long dialogId, int encryptorType) {
        return message;
    }

    public static String encryptMessage(String message, long dialogId, BaseEncryptor encryptor) {
        return message;
    }

    public static String encryptMessage(String message, long dialogId, Object encryptor) {
        return message;
    }

    public static void encryptMessage(String message, long dialogId, int encryptorType, Callback callback) {
        if (callback != null) {
            callback.onResult(message);
        }
    }

    public static void encryptMessage(String message, long dialogId, BaseEncryptor encryptor, Callback callback) {
        if (callback != null) {
            callback.onResult(message);
        }
    }

    public interface Callback {
        void onResult(String result);
    }
}