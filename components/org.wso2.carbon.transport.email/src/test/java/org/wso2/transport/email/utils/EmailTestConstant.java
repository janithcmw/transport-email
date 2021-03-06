/*
 * Copyright (c) 2017 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.transport.email.utils;

/**
 * Constant needed in Email Connector Test Cases.
 */
public class EmailTestConstant {

    private EmailTestConstant() {
    }

    /**
     * Email server Connector property
     */
    public static final String POLLING_INTERVAL = "pollingInterval";
    public static final String POLLING_INTERVAL_VALUE = "3000";
    public static final String MAX_RETRY_COUNT = "retryCount";
    public static final String RETRY_INTERVAL = "retryInterval";

    /**
     * Email Receiver properties
     */
    public static final String MAIL_RECEIVER_USERNAME = "username";
    public static final String MAIL_RECEIVER_PASSWORD = "password";
    public static final String MAIL_RECEIVER_STORE_TYPE = "storeType";
    public static final String MAIL_RECEIVER_HOST_NAME = "hostName";
    public static final String MAIL_RECEIVER_FOLDER_NAME = "folderName";
    public static final String FOLDER_NAME = "INBOX";
    public static final String CONTENT_TYPE = "contentType";

    /**
     * Action that has to carry out after processing the email.
     */
    public static final String ACTION_AFTER_PROCESSED = "actionAfterProcessed";

    /**
     * Folder to move the processed email if action after processed if MOVE.
     */
    public static final String MOVE_TO_FOLDER = "moveToFolder";

    /**
     * property whether to Auto Acknowledge or not. If false then wait for acknowledge.
     */
    public static final String AUTO_ACKNOWLEDGE = "autoAcknowledge";
    public static final String AUTO_ACKNOWLWDGE_VALUE = "false";

    /**
     * String search term to give the conditions to filter the messages
     */

    public static final String SEARCH_TERM = "searchTerm";

    /**
     * Email content types
     */
    public static final String CONTENT_TYPE_TEXT_PLAIN = "text/plain";
    public static final String CONTENT_TYPE_TEXT_HTML = "text/html";

    /**
     * Email sender properties
     */
    public static final String MAIL_SENDER_USERNAME = "username";
    public static final String MAIL_SENDER_PASSWORD = "password";
    public static final String MAIL_SENDER_HOST_NAME = "hostName";

    /**
     * Mail Headers which has to set in the message to be send at the email.
     * client connector
     */
    public static final String MAIL_HEADER_TO = "To";
    public static final String MAIL_HEADER_CC = "Cc";
    public static final String MAIL_HEADER_BCC = "Bcc";
    public static final String MAIL_HEADER_FROM = "From";
    public static final String MAIL_HEADER_SUBJECT = "Subject";
    public static final String MAIL_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String MAIL_PROPERTY_UID = "messageUid";
    public static final String MAIL_HEADER_REPLY_TO = "Reply-To";
    public static final String MAIL_HEADER_IN_REPLY_TO = "In-Reply-To";
    public static final String MAIL_HEADER_MESSAGE_ID = "Message-ID";

    public static final String MAIL_IMAP_PORT = "mail.imap.port";
    public static final String MAIL_IMAP_PORT_VALUE = "3143";
    public static final String MAIL_POP3_PORT = "mail.pop3.port";
    public static final String MAIL_POP3_PORT_VALUE = "3110";

    /**
     * time in minutes that wait client connector
     * to close the connection after send method call
     */
    public static final String WAIT_TIME = "waitTime";

}
