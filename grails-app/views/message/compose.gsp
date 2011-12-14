
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <title>Compose a Message</title>
    </head>
    
    <body>
        
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
        </div>
       
        <div class="body">
            <h1>Compose a message</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:form action="send" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="from">from</label>
                                </td>
                                <td valign="top" class="value">
                                    <g:textField name="from"  />
                                </td>
                            </tr>
                            
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="subject">Subject</label>
                                </td>
                                <td valign="top" class="value">
                                    <g:textField name="subject"  />
                                </td>
                            </tr>
                            
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="body">Body</label>
                                </td>
                                <td valign="top" class="value">
                                    <g:textArea name="body"  />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                
                <div class="buttons">
                	<span class="button"><g:submitButton name="send" class="save" value="Send" /></span>
                </div>
                
            </g:form>
        </div>
    </body>
</html>