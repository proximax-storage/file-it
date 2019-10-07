package io.proximax.app.utils;

/*
 * Copyright 2018 ProximaX Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 /*
 * Proximax P2P Storage REST API
 * Proximax P2P Storage REST API
 *
 * OpenAPI spec version: v0.0.1
 * Contact: alvin.reyes@botmill.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/**
 * The Class StringUtils.
 */
public class StringUtils {

    /**
     * Check if the given array contains the given value (with case-insensitive
     * comparison).
     *
     * @param array The array
     * @param value The value to search
     * @return true if the array contains the value
     */
    public static boolean containsIgnoreCase(String[] array, String value) {
        for (String str : array) {
            if (value == null && str == null) {
                return true;
            }
            if (value != null && value.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Join an array of strings with the given separator.
     * <p>
     * Note: This might be replaced by utility method from commons-lang or guava
     * someday if one of those libraries is added as dependency.
     * </p>
     *
     * @param array The array of strings
     * @param separator The separator
     * @return the resulting string
     */
    public static String join(String[] array, String separator) {
        int len = array.length;
        if (len == 0) {
            return "";
        }

        StringBuilder out = new StringBuilder();
        out.append(array[0]);
        for (int i = 1; i < len; i++) {
            out.append(separator).append(array[i]);
        }
        return out.toString();
    }

    /**
     * Checks if is empty.
     *
     * @param str the str
     * @return true, if is empty
     */
    public static boolean isEmpty(String str) {
        return null == str || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static long parseLong(String s, long l) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException ex) {
        }
        return l;
    }

    public static int parseInt(String s, int i) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
        }
        return i;
    }

    public static String getFileSize(long fileSize) {
        String str = "";
        if (fileSize < 1024) {
            str = "" + fileSize + " bytes";
        } else if (fileSize < 1048576) {
            str = "" + (fileSize / 1024) + " Kb";
        } else if (fileSize < 1073741824) {
            str = "" + (fileSize / 1048576) + " Mb";
        } else if (fileSize < (1073741824 * 1024)) {
            str = "" + (fileSize / 1073741824) + " Gb";
        }
        return str;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception ex) {
        }
    }
}
