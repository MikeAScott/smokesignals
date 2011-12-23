
<%@ page import="com.enkida.smokesignals.Message" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'message.label', default: 'Message')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="compose"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'message.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="mailTo" title="${message(code: 'message.mailTo.label', default: 'Mail To')}" />
                        
                            <g:sortableColumn property="mailFrom" title="${message(code: 'message.mailFrom.label', default: 'Mail From')}" />
                        
                            <g:sortableColumn property="status" title="${message(code: 'message.status.label', default: 'Status')}" />
                        
                            <g:sortableColumn property="body" title="${message(code: 'message.body.label', default: 'Body')}" />
                        
                            <g:sortableColumn property="subject" title="${message(code: 'message.subject.label', default: 'Subject')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${messageInstanceList}" status="i" var="messageInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${messageInstance.id}">${fieldValue(bean: messageInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: messageInstance, field: "mailTo")}</td>
                        
                            <td>${fieldValue(bean: messageInstance, field: "mailFrom")}</td>
                        
                            <td>${fieldValue(bean: messageInstance, field: "status")}</td>
                        
                            <td>${fieldValue(bean: messageInstance, field: "body")}</td>
                        
                            <td>${fieldValue(bean: messageInstance, field: "subject")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${messageInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
