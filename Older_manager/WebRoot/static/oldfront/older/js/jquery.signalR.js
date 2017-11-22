/*!
 * ASP.NET SignalR JavaScript Library v2.0.2
 * http://signalr.net/
 *
 * Copyright (C) Microsoft Corporation. All rights reserved.
 *
 */
(function (n, t, i) {
    "use strict";

    function p(t, i) {
        var u, f;
        if (n.isArray(t)) {
            for (u = t.length - 1; u >= 0; u--) f = t[u], n.type(f) === "string" && r.transports[f] || (i.log("Invalid transport: " + f + ", removing it from the transports list."), t.splice(u, 1));
            t.length === 0 && (i.log("No transports remain within the specified transport array."), t = null)
        } else if (r.transports[t] || t === "auto") {
            if (t === "auto" && r._.ieVersion <= 8) return ["longPolling"]
        } else i.log("Invalid transport: " + t.toString() + "."), t = null;
        return t
    }

    function w(n) {
        return n === "http:" ? 80 : n === "https:" ? 443 : void 0
    }

    function l(n, t) {
        return t.match(/:\d+$/) ? t : t + ":" + w(n)
    }

    function b(t, i) {
        var u = this,
            r = [];
        u.tryBuffer = function (i) {
            return t.state === n.signalR.connectionState.connecting ? (r.push(i), !0) : !1
        };
        u.drain = function () {
            if (t.state === n.signalR.connectionState.connected)
                while (r.length > 0) i(r.shift())
        };
        u.clear = function () {
            r = []
        }
    }
    var f = {
        nojQuery: "jQuery was not found. Please ensure jQuery is referenced before the SignalR client JavaScript file.",
        noTransportOnInit: "No transport could be initialized successfully. Try specifying a different transport or none at all for auto initialization.",
        errorOnNegotiate: "Error during negotiation request.",
        stoppedWhileLoading: "The connection was stopped during page load.",
        stoppedWhileNegotiating: "The connection was stopped during the negotiate request.",
        errorParsingNegotiateResponse: "Error parsing negotiate response.",
        protocolIncompatible: "You are using a version of the client that isn't compatible with the server. Client version {0}, server version {1}.",
        sendFailed: "Send failed.",
        parseFailed: "Failed at parsing response: {0}",
        longPollFailed: "Long polling request failed.",
        eventSourceFailedToConnect: "EventSource failed to connect.",
        eventSourceError: "Error raised by EventSource",
        webSocketClosed: "WebSocket closed.",
        pingServerFailedInvalidResponse: "Invalid ping response when pinging server: '{0}'.",
        pingServerFailed: "Failed to ping server.",
        pingServerFailedStatusCode: "Failed to ping server.  Server responded with status code {0}, stopping the connection.",
        pingServerFailedParse: "Failed to parse ping server response, stopping the connection.",
        noConnectionTransport: "Connection is in an invalid state, there is no transport active.",
        webSocketsInvalidState: "The Web Socket transport is in an invalid state, transitioning into reconnecting."
    };
    if (typeof n != "function") throw new Error(f.nojQuery);
    var r, h, s = t.document.readyState === "complete",
        e = n(t),
        c = "__Negotiate Aborted__",
        u = {
            onStart: "onStart",
            onStarting: "onStarting",
            onReceived: "onReceived",
            onError: "onError",
            onConnectionSlow: "onConnectionSlow",
            onReconnecting: "onReconnecting",
            onReconnect: "onReconnect",
            onStateChanged: "onStateChanged",
            onDisconnect: "onDisconnect"
        },
        a = function (n, i) {
            if (i !== !1) {
                var r;
                typeof t.console != "undefined" && (r = "[" + (new Date).toTimeString() + "] SignalR: " + n, t.console.debug ? t.console.debug(r) : t.console.log && t.console.log(r))
            }
        },
        o = function (t, i, r) {
            return i === t.state ? (t.state = r, n(t).triggerHandler(u.onStateChanged, [{
                oldState: i,
                newState: r
            }]), !0) : !1
        },
        v = function (n) {
            return n.state === r.connectionState.disconnected
        },
        y = function (n) {
            var i, u;
            n._.configuredStopReconnectingTimeout || (u = function (n) {
                n.log("Couldn't reconnect within the configured timeout (" + n.disconnectTimeout + "ms), disconnecting.");
                n.stop(!1, !1)
            }, n.reconnecting(function () {
                var n = this;
                n.state === r.connectionState.reconnecting && (i = t.setTimeout(function () {
                    u(n)
                }, n.disconnectTimeout))
            }), n.stateChanged(function (n) {
                n.oldState === r.connectionState.reconnecting && t.clearTimeout(i)
            }), n._.configuredStopReconnectingTimeout = !0)
        };
    r = function (n, t, i) {
        return new r.fn.init(n, t, i)
    };
    r._ = {
        defaultContentType: "application/x-www-form-urlencoded; charset=UTF-8",
        ieVersion: function () {
            var i, n;
            return t.navigator.appName === "Microsoft Internet Explorer" && (n = /MSIE ([0-9]+\.[0-9]+)/.exec(t.navigator.userAgent), n && (i = t.parseFloat(n[1]))), i
        }(),
        error: function (n, t, i) {
            var r = new Error(n);
            return r.source = t, typeof i != "undefined" && (r.context = i), r
        }, transportError: function (n, t, r, u) {
            var f = this.error(n, r, u);
            return f.transport = t ? t.name : i, f
        }, format: function () {
            for (var t = arguments[0], n = 0; n < arguments.length - 1; n++) t = t.replace("{" + n + "}", arguments[n + 1]);
            return t
        }, firefoxMajorVersion: function (n) {
            var t = n.match(/Firefox\/(\d+)/);
            return !t || !t.length || t.length < 2 ? 0 : parseInt(t[1], 10)
        }, configurePingInterval: function (i) {
            var f = i._.config,
                e = function (t) {
                    n(i).triggerHandler(u.onError, [t])
                };
            !i._.pingIntervalId && f.pingInterval && (i._.pingIntervalId = t.setInterval(function () {
                r.transports._logic.pingServer(i).fail(e)
            }, f.pingInterval))
        }
    };
    r.events = u;
    r.resources = f;
    r.ajaxDefaults = {
        processData: !0,
        timeout: null,
        async: !0,
        global: !1,
        cache: !1
    };
    r.changeState = o;
    r.isDisconnecting = v;
    r.connectionState = {
        connecting: 0,
        connected: 1,
        reconnecting: 2,
        disconnected: 4
    };
    r.hub = {
        start: function () {
            throw new Error("SignalR: Error loading hubs. Ensure your hubs reference is correct, e.g. <script src='/signalr/js'><\/script>.");
        }
    };
    e.load(function () {
        s = !0
    });
    r.fn = r.prototype = {
        init: function (t, i, r) {
            var f = n(this);
            this.url = t;
            this.qs = i;
            this._ = {
                keepAliveData: {},
                connectingMessageBuffer: new b(this, function (n) {
                    f.triggerHandler(u.onReceived, [n])
                }),
                onFailedTimeoutHandle: null,
                lastMessageAt: (new Date).getTime(),
                lastActiveAt: (new Date).getTime(),
                beatInterval: 5e3,
                beatHandle: null
            };
            typeof r == "boolean" && (this.logging = r)
        }, _parseResponse: function (n) {
            var t = this;
            return n ? typeof n == "string" ? t.json.parse(n) : n : n
        }, json: t.JSON,
        isCrossDomain: function (i, r) {
            var u;
            return (i = n.trim(i), r = r || t.location, i.indexOf("http") !== 0) ? !1 : (u = t.document.createElement("a"), u.href = i, u.protocol + l(u.protocol, u.host) !== r.protocol + l(r.protocol, r.host))
        }, ajaxDataType: "text",
        contentType: "application/json; charset=UTF-8",
        logging: !1,
        state: r.connectionState.disconnected,
        clientProtocol: "1.3",
        reconnectDelay: 2e3,
        transportConnectTimeout: 0,
        disconnectTimeout: 3e4,
        reconnectWindow: 3e4,
        keepAliveWarnAt: 2 / 3,
        start: function (i, h) {
            var l = this,
                a = {
                    pingInterval: 3e5,
                    waitForPageLoad: !0,
                    transport: "auto",
                    jsonp: !1
                },
                k, v = l._deferral || n.Deferred(),
                w = t.document.createElement("a"),
                b, d;
            if (l._deferral = v, !l.json) throw new Error("SignalR: No JSON parser found. Please ensure json2.js is referenced before the SignalR.js file if you need to support clients without native JSON parsing support, e.g. IE<8.");
            if (n.type(i) === "function" ? h = i : n.type(i) === "object" && (n.extend(a, i), n.type(a.callback) === "function" && (h = a.callback)), a.transport = p(a.transport, l), !a.transport) throw new Error("SignalR: Invalid transport(s) specified, aborting start.");
            return (l._.config = a, !s && a.waitForPageLoad === !0) ? (l._.deferredStartHandler = function () {
                l.start(i, h)
            }, e.bind("load", l._.deferredStartHandler), v.promise()) : l.state === r.connectionState.connecting ? v.promise() : o(l, r.connectionState.disconnected, r.connectionState.connecting) === !1 ? (v.resolve(l), v.promise()) : (y(l), w.href = l.url, w.protocol && w.protocol !== ":" ? (l.protocol = w.protocol, l.host = w.host, l.baseUrl = w.protocol + "//" + w.host) : (l.protocol = t.document.location.protocol, l.host = t.document.location.host, l.baseUrl = l.protocol + "//" + l.host), l.wsProtocol = l.protocol === "https:" ? "wss://" : "ws://", a.transport === "auto" && a.jsonp === !0 && (a.transport = "longPolling"), l.url.indexOf("//") === 0 && (l.url = t.location.protocol + l.url, l.log("Protocol relative URL detected, normalizing it to '" + l.url + "'.")), this.isCrossDomain(l.url) && (l.log("Auto detected cross domain url."), a.transport === "auto" && (a.transport = ["webSockets", "longPolling"]), typeof a.withCredentials == "undefined" && (a.withCredentials = !0), a.jsonp || (a.jsonp = !n.support.cors, a.jsonp && l.log("Using jsonp because this browser doesn't support CORS.")), l.contentType = r._.defaultContentType), l.withCredentials = a.withCredentials, l.ajaxDataType = a.jsonp ? "jsonp" : "text", n(l).bind(u.onStart, function () {
                n.type(h) === "function" && h.call(l);
                v.resolve(l)
            }), k = function (i, s) {
                var y = r._.error(f.noTransportOnInit);
                if (s = s || 0, s >= i.length) {
                    n(l).triggerHandler(u.onError, [y]);
                    v.reject(y);
                    l.stop();
                    return
                }
                if (l.state !== r.connectionState.disconnected) {
                    var p = i[s],
                        h = r.transports[p],
                        c = !1,
                        a = function () {
                            c || (c = !0, t.clearTimeout(l._.onFailedTimeoutHandle), h.stop(l), k(i, s + 1))
                        };
                    l.transport = h;
                    try {
                        l._.onFailedTimeoutHandle = t.setTimeout(function () {
                            l.log(h.name + " timed out when trying to connect.");
                            a()
                        }, l.transportConnectTimeout);
                        h.start(l, function () {
                            var i = r._.firefoxMajorVersion(t.navigator.userAgent) >= 11,
                                f = !!l.withCredentials && i;
                            l.state !== r.connectionState.disconnected && (c || (c = !0, t.clearTimeout(l._.onFailedTimeoutHandle), h.supportsKeepAlive && l._.keepAliveData.activated && r.transports._logic.monitorKeepAlive(l), r.transports._logic.startHeartbeat(l), r._.configurePingInterval(l), o(l, r.connectionState.connecting, r.connectionState.connected), l._.connectingMessageBuffer.drain(), n(l).triggerHandler(u.onStart), e.bind("unload", function () {
                                l.log("Window unloading, stopping the connection.");
                                l.stop(f)
                            }), i && e.bind("beforeunload", function () {
                                t.setTimeout(function () {
                                    l.stop(f)
                                }, 0)
                            })))
                        }, a)
                    } catch (w) {
                        l.log(h.name + " transport threw '" + w.message + "' when attempting to start.");
                        a()
                    }
                }
            }, b = l.url + "/negotiate", d = function (t, i) {
                var e = r._.error(f.errorOnNegotiate, t, i._.negotiateRequest);
                n(i).triggerHandler(u.onError, e);
                v.reject(e);
                i.stop()
            }, n(l).triggerHandler(u.onStarting), b = r.transports._logic.prepareQueryString(l, b), b = r.transports._logic.addQs(b, {
                clientProtocol: l.clientProtocol
            }), l.log("Negotiating with '" + b + "'."), l._.negotiateRequest = n.ajax(n.extend({}, n.signalR.ajaxDefaults, {
                xhrFields: {
                    withCredentials: l.withCredentials
                },
                url: b,
                type: "GET",
                contentType: l.contentType,
                data: {},
                dataType: l.ajaxDataType,
                error: function (n, t) {
                    t !== c ? d(n, l) : v.reject(r._.error(f.stoppedWhileNegotiating, null, l._.negotiateRequest))
                }, success: function (t) {
                    var i, e, h, o = [],
                        s = [];
                    try {
                        i = l._parseResponse(t)
                    } catch (c) {
                        d(r._.error(f.errorParsingNegotiateResponse, c), l);
                        return
                    }
                    if (e = l._.keepAliveData, l.appRelativeUrl = i.Url, l.id = i.ConnectionId, l.token = i.ConnectionToken, l.webSocketServerUrl = i.WebSocketServerUrl, l.disconnectTimeout = i.DisconnectTimeout * 1e3, l.transportConnectTimeout = l.transportConnectTimeout + i.TransportConnectTimeout * 1e3, i.KeepAliveTimeout ? (e.activated = !0, e.timeout = i.KeepAliveTimeout * 1e3, e.timeoutWarning = e.timeout * l.keepAliveWarnAt, l._.beatInterval = (e.timeout - e.timeoutWarning) / 3) : e.activated = !1, l.reconnectWindow = l.disconnectTimeout + (e.timeout || 0), !i.ProtocolVersion || i.ProtocolVersion !== l.clientProtocol) {
                        h = r._.error(r._.format(f.protocolIncompatible, l.clientProtocol, i.ProtocolVersion));
                        n(l).triggerHandler(u.onError, [h]);
                        v.reject(h);
                        return
                    }
                    n.each(r.transports, function (n) {
                        if (n.indexOf("_") === 0 || n === "webSockets" && !i.TryWebSockets) return !0;
                        s.push(n)
                    });
                    n.isArray(a.transport) ? n.each(a.transport, function (t, i) {
                        n.inArray(i, s) >= 0 && o.push(i)
                    }) : a.transport === "auto" ? o = s : n.inArray(a.transport, s) >= 0 && o.push(a.transport);
                    k(o)
                }
            })), v.promise())
        }, starting: function (t) {
            var i = this;
            return n(i).bind(u.onStarting, function () {
                t.call(i)
            }), i
        }, send: function (n) {
            var t = this;
            if (t.state === r.connectionState.disconnected) throw new Error("SignalR: Connection must be started before data can be sent. Call .start() before .send()");
            if (t.state === r.connectionState.connecting) throw new Error("SignalR: Connection has not been fully initialized. Use .start().done() or .start().fail() to run logic after the connection has started.");
            return t.transport.send(t, n), t
        }, received: function (t) {
            var i = this;
            return n(i).bind(u.onReceived, function (n, r) {
                t.call(i, r)
            }), i
        }, stateChanged: function (t) {
            var i = this;
            return n(i).bind(u.onStateChanged, function (n, r) {
                t.call(i, r)
            }), i
        }, error: function (t) {
            var i = this;
            return n(i).bind(u.onError, function (n, r, u) {
                t.call(i, r, u)
            }), i
        }, disconnected: function (t) {
            var i = this;
            return n(i).bind(u.onDisconnect, function () {
                t.call(i)
            }), i
        }, connectionSlow: function (t) {
            var i = this;
            return n(i).bind(u.onConnectionSlow, function () {
                t.call(i)
            }), i
        }, reconnecting: function (t) {
            var i = this;
            return n(i).bind(u.onReconnecting, function () {
                t.call(i)
            }), i
        }, reconnected: function (t) {
            var i = this;
            return n(i).bind(u.onReconnect, function () {
                t.call(i)
            }), i
        }, stop: function (i, h) {
            var l = this,
                a = l._deferral;
            if (l._.deferredStartHandler && e.unbind("load", l._.deferredStartHandler), delete l._deferral, delete l._.config, delete l._.deferredStartHandler, !s && (!l._.config || l._.config.waitForPageLoad === !0)) {
                l.log("Stopping connection prior to negotiate.");
                a && a.reject(r._.error(f.stoppedWhileLoading));
                return
            }
            if (l.state !== r.connectionState.disconnected) return l.log("Stopping connection."), o(l, l.state, r.connectionState.disconnected), t.clearTimeout(l._.beatHandle), t.clearTimeout(l._.onFailedTimeoutHandle), t.clearInterval(l._.pingIntervalId), l.transport && (l.transport.stop(l), h !== !1 && l.transport.abort(l, i), l.transport.supportsKeepAlive && l._.keepAliveData.activated && r.transports._logic.stopMonitoringKeepAlive(l), l.transport = null), l._.negotiateRequest && (l._.negotiateRequest.abort(c), delete l._.negotiateRequest), n(l).triggerHandler(u.onDisconnect), delete l.messageId, delete l.groupsToken, delete l.id, delete l._.pingIntervalId, delete l._.lastMessageAt, delete l._.lastActiveAt, l._.connectingMessageBuffer.clear(), l
        }, log: function (n) {
            a(n, this.logging)
        }
    };
    r.fn.init.prototype = r.fn;
    r.noConflict = function () {
        return n.connection === r && (n.connection = h), r
    };
    n.connection && (h = n.connection);
    n.connection = n.signalR = r
})(window.jQuery, window),
function (n, t) {
    "use strict";

    function f(n) {
        n._.keepAliveData.monitoring && o(n);
        r.markActive(n) && (n._.beatHandle = t.setTimeout(function () {
            f(n)
        }, n._.beatInterval))
    }

    function o(t) {
        var r = t._.keepAliveData,
            f;
        t.state === i.connectionState.connected && (f = (new Date).getTime() - t._.lastMessageAt, f >= r.timeout ? (t.log("Keep alive timed out.  Notifying transport that connection has been lost."), t.transport.lostConnection(t)) : f >= r.timeoutWarning ? r.userNotified || (t.log("Keep alive has been missed, connection may be dead/slow."), n(t).triggerHandler(u.onConnectionSlow), r.userNotified = !0) : r.userNotified = !1)
    }

    function s(n) {
        return n.state === i.connectionState.connected || n.state === i.connectionState.reconnecting
    }

    function h(n, i) {
        var r = n.indexOf("?") !== -1 ? "&" : "?";
        return i && (n += r + "connectionData=" + t.encodeURIComponent(i)), n
    }
    var i = n.signalR,
        u = n.signalR.events,
        e = n.signalR.changeState,
        r;
    i.transports = {};
    r = i.transports._logic = {
        pingServer: function (t) {
            var e, u = n.Deferred(),
                f;
            return t.transport ? (e = t.url + "/ping", e = r.addQs(e, t.qs), f = n.ajax(n.extend({}, n.signalR.ajaxDefaults, {
                xhrFields: {
                    withCredentials: t.withCredentials
                },
                url: e,
                type: "GET",
                contentType: t.contentType,
                data: {},
                dataType: t.ajaxDataType,
                success: function (n) {
                    var r;
                    try {
                        r = t._parseResponse(n)
                    } catch (e) {
                        u.reject(i._.transportError(i.resources.pingServerFailedParse, t.transport, e, f));
                        t.stop();
                        return
                    }
                    r.Response === "pong" ? u.resolve() : u.reject(i._.transportError(i._.format(i.resources.pingServerFailedInvalidResponse, n.responseText), t.transport, null, f))
                }, error: function (n) {
                    n.status === 401 || n.status === 403 ? (u.reject(i._.transportError(i._.format(i.resources.pingServerFailedStatusCode, n.status), t.transport, n, f)), t.stop()) : u.reject(i._.transportError(i.resources.pingServerFailed, t.transport, n, f))
                }
            }))) : u.reject(i._.transportError(i.resources.noConnectionTransport, t.transport)), u.promise()
        }, prepareQueryString: function (n, t) {
            return t = r.addQs(t, n.qs), h(t, n.data)
        }, addQs: function (t, i) {
            var r = t.indexOf("?") !== -1 ? "&" : "?",
                u;
            if (!i) return t;
            if (typeof i == "object") return t + r + n.param(i);
            if (typeof i == "string") return u = i.charAt(0), (u === "?" || u === "&") && (r = ""), t + r + i;
            throw new Error("Query string property must be either a string or object.");
        }, getUrl: function (n, i, u, f) {
            var s = i === "webSockets" ? "" : n.baseUrl,
                e = s + n.appRelativeUrl,
                o = "transport=" + i + "&connectionToken=" + t.encodeURIComponent(n.token);
            return n.groupsToken && (o += "&groupsToken=" + t.encodeURIComponent(n.groupsToken)), u ? (e += f ? "/poll" : "/reconnect", n.messageId && (o += "&messageId=" + t.encodeURIComponent(n.messageId))) : e += "/connect", e += "?" + o, e = r.prepareQueryString(n, e), e + ("&tid=" + Math.floor(Math.random() * 11))
        }, maximizePersistentResponse: function (n) {
            return {
                MessageId: n.C,
                Messages: n.M,
                Initialized: typeof n.S != "undefined" ? !0 : !1,
                Disconnect: typeof n.D != "undefined" ? !0 : !1,
                ShouldReconnect: typeof n.T != "undefined" ? !0 : !1,
                LongPollDelay: n.L,
                GroupsToken: n.G
            }
        }, updateGroups: function (n, t) {
            t && (n.groupsToken = t)
        }, stringifySend: function (n, t) {
            return typeof t == "string" || typeof t == "undefined" || t === null ? t : n.json.stringify(t)
        }, ajaxSend: function (f, e) {
            var c = r.stringifySend(f, e),
                o = f.url + "/send?transport=" + f.transport.name + "&connectionToken=" + t.encodeURIComponent(f.token),
                s, h = function (t, r) {
                    n(r).triggerHandler(u.onError, [i._.transportError(i.resources.sendFailed, r.transport, t, s), e])
                };
            return o = r.prepareQueryString(f, o), s = n.ajax(n.extend({}, n.signalR.ajaxDefaults, {
                xhrFields: {
                    withCredentials: f.withCredentials
                },
                url: o,
                type: f.ajaxDataType === "jsonp" ? "GET" : "POST",
                contentType: i._.defaultContentType,
                dataType: f.ajaxDataType,
                data: {
                    data: c
                },
                success: function (n) {
                    var t;
                    if (n) {
                        try {
                            t = f._parseResponse(n)
                        } catch (i) {
                            h(i, f);
                            f.stop();
                            return
                        }
                        r.triggerReceived(f, t)
                    }
                }, error: function (n, t) {
                    t !== "abort" && t !== "parsererror" && h(n, f)
                }
            }))
        }, ajaxAbort: function (i, u) {
            if (typeof i.transport != "undefined") {
                u = typeof u == "undefined" ? !0 : u;
                var f = i.url + "/abort?transport=" + i.transport.name + "&connectionToken=" + t.encodeURIComponent(i.token);
                f = r.prepareQueryString(i, f);
                n.ajax(n.extend({}, n.signalR.ajaxDefaults, {
                    xhrFields: {
                        withCredentials: i.withCredentials
                    },
                    url: f,
                    async: u,
                    timeout: 1e3,
                    type: "POST",
                    contentType: i.contentType,
                    dataType: i.ajaxDataType,
                    data: {}
                }));
                i.log("Fired ajax abort async = " + u + ".")
            }
        }, tryInitialize: function (n, t) {
            n.Initialized && t()
        }, triggerReceived: function (t, i) {
            t._.connectingMessageBuffer.tryBuffer(i) || n(t).triggerHandler(u.onReceived, [i])
        }, processMessages: function (t, i, u) {
            var f;
            if (r.markLastMessage(t), i) {
                if (f = r.maximizePersistentResponse(i), f.Disconnect) {
                    t.log("Disconnect command received from server.");
                    t.stop(!1, !1);
                    return
                }
                r.updateGroups(t, f.GroupsToken);
                f.MessageId && (t.messageId = f.MessageId);
                f.Messages && (n.each(f.Messages, function (n, i) {
                    r.triggerReceived(t, i)
                }), r.tryInitialize(f, u))
            }
        }, monitorKeepAlive: function (t) {
            var i = t._.keepAliveData;
            i.monitoring ? t.log("Tried to monitor keep alive but it's already being monitored.") : (i.monitoring = !0, r.markLastMessage(t), t._.keepAliveData.reconnectKeepAliveUpdate = function () {
                r.markLastMessage(t)
            }, n(t).bind(u.onReconnect, t._.keepAliveData.reconnectKeepAliveUpdate), t.log("Now monitoring keep alive with a warning timeout of " + i.timeoutWarning + " and a connection lost timeout of " + i.timeout + "."))
        }, stopMonitoringKeepAlive: function (t) {
            var i = t._.keepAliveData;
            i.monitoring && (i.monitoring = !1, n(t).unbind(u.onReconnect, t._.keepAliveData.reconnectKeepAliveUpdate), t._.keepAliveData = {}, t.log("Stopping the monitoring of the keep alive."))
        }, startHeartbeat: function (n) {
            f(n)
        }, markLastMessage: function (n) {
            n._.lastMessageAt = (new Date).getTime()
        }, markActive: function (n) {
            return r.verifyLastActive(n) ? (n._.lastActiveAt = (new Date).getTime(), !0) : !1
        }, ensureReconnectingState: function (t) {
            return e(t, i.connectionState.connected, i.connectionState.reconnecting) === !0 && n(t).triggerHandler(u.onReconnecting), t.state === i.connectionState.reconnecting
        }, clearReconnectTimeout: function (n) {
            n && n._.reconnectTimeout && (t.clearTimeout(n._.reconnectTimeout), delete n._.reconnectTimeout)
        }, verifyLastActive: function (n) {
            return (new Date).getTime() - n._.lastActiveAt >= n.reconnectWindow ? (n.log("There has not been an active server connection for an extended period of time. Stopping connection."), n.stop(), !1) : !0
        }, reconnect: function (n, u) {
            var f = i.transports[u];
            if (s(n) && !n._.reconnectTimeout) {
                if (!r.verifyLastActive(n)) return;
                n._.reconnectTimeout = t.setTimeout(function () {
                    r.verifyLastActive(n) && (f.stop(n), r.ensureReconnectingState(n) && (n.log(u + " reconnecting."), f.start(n)))
                }, n.reconnectDelay)
            }
        }, handleParseFailure: function (t, r, f, e, o) {
            t.state === i.connectionState.connecting ? (t.log("Failed to parse server response while attempting to connect."), e()) : (n(t).triggerHandler(u.onError, [i._.transportError(i._.format(i.resources.parseFailed, r), t.transport, f, o)]), t.stop())
        }, foreverFrame: {
            count: 0,
            connections: {}
        }
    }
}(window.jQuery, window),
function (n, t) {
    "use strict";
    var r = n.signalR,
        u = n.signalR.events,
        f = n.signalR.changeState,
        i = r.transports._logic;
    r.transports.webSockets = {
        name: "webSockets",
        supportsKeepAlive: !0,
        send: function (t, f) {
            var e = i.stringifySend(t, f);
            try {
                t.socket.send(e)
            } catch (o) {
                n(t).triggerHandler(u.onError, [r._.transportError(r.resources.webSocketsInvalidState, t.transport, o, t.socket), f])
            }
        }, start: function (e, o, s) {
            var h, c = !1,
                l = this,
                a = !o,
                v = n(e);
            if (!t.WebSocket) {
                s();
                return
            }
            e.socket || (h = e.webSocketServerUrl ? e.webSocketServerUrl : e.wsProtocol + e.host, h += i.getUrl(e, this.name, a), e.log("Connecting to websocket endpoint '" + h + "'."), e.socket = new t.WebSocket(h), e.socket.onopen = function () {
                c = !0;
                e.log("Websocket opened.");
                i.clearReconnectTimeout(e);
                f(e, r.connectionState.reconnecting, r.connectionState.connected) === !0 && v.triggerHandler(u.onReconnect)
            }, e.socket.onclose = function (t) {
                if (this === e.socket) {
                    if (c) typeof t.wasClean != "undefined" && t.wasClean === !1 ? (n(e).triggerHandler(u.onError, [r._.transportError(r.resources.webSocketClosed, e.transport, t)]), e.log("Unclean disconnect from websocket: " + t.reason || "[no reason given].")) : e.log("Websocket closed.");
                    else {
                        s ? s() : a && l.reconnect(e);
                        return
                    }
                    l.reconnect(e)
                }
            }, e.socket.onmessage = function (t) {
                var r;
                try {
                    r = e._parseResponse(t.data)
                } catch (u) {
                    i.handleParseFailure(e, t.data, u, s, t);
                    return
                }
                r && (n.isEmptyObject(r) || r.M ? i.processMessages(e, r, o) : i.triggerReceived(e, r))
            })
        }, reconnect: function (n) {
            i.reconnect(n, this.name)
        }, lostConnection: function (n) {
            this.reconnect(n)
        }, stop: function (n) {
            i.clearReconnectTimeout(n);
            n.socket && (n.log("Closing the Websocket."), n.socket.close(), n.socket = null)
        }, abort: function (n, t) {
            i.ajaxAbort(n, t)
        }
    }
}(window.jQuery, window),
function (n, t) {
    "use strict";
    var i = n.signalR,
        u = n.signalR.events,
        f = n.signalR.changeState,
        r = i.transports._logic;
    i.transports.serverSentEvents = {
        name: "serverSentEvents",
        supportsKeepAlive: !0,
        timeOut: 3e3,
        start: function (e, o, s) {
            var h = this,
                c = !1,
                l = n(e),
                a = !o,
                v, y;
            if (e.eventSource && (e.log("The connection already has an event source. Stopping it."), e.stop()), !t.EventSource) {
                s && (e.log("This browser doesn't support SSE."), s());
                return
            }
            v = r.getUrl(e, this.name, a);
            try {
                e.log("Attempting to connect to SSE endpoint '" + v + "'.");
                e.eventSource = new t.EventSource(v)
            } catch (p) {
                e.log("EventSource failed trying to connect with error " + p.Message + ".");
                s ? s() : (l.triggerHandler(u.onError, [i._.transportError(i.resources.eventSourceFailedToConnect, e.transport, p)]), a && h.reconnect(e));
                return
            }
            a && (y = t.setTimeout(function () {
                c === !1 && e.eventSource.readyState !== t.EventSource.OPEN && h.reconnect(e)
            }, h.timeOut));
            e.eventSource.addEventListener("open", function () {
                e.log("EventSource connected.");
                y && t.clearTimeout(y);
                r.clearReconnectTimeout(e);
                c === !1 && (c = !0, f(e, i.connectionState.reconnecting, i.connectionState.connected) === !0 && l.triggerHandler(u.onReconnect))
            }, !1);
            e.eventSource.addEventListener("message", function (n) {
                var t;
                if (n.data !== "initialized") {
                    try {
                        t = e._parseResponse(n.data)
                    } catch (i) {
                        r.handleParseFailure(e, n.data, i, s, n);
                        return
                    }
                    r.processMessages(e, t, o)
                }
            }, !1);
            e.eventSource.addEventListener("error", function (n) {
                if (this === e.eventSource) {
                    if (!c) {
                        s && s();
                        return
                    }
                    e.log("EventSource readyState: " + e.eventSource.readyState + ".");
                    n.eventPhase === t.EventSource.CLOSED ? (e.log("EventSource reconnecting due to the server connection ending."), h.reconnect(e)) : (e.log("EventSource error."), l.triggerHandler(u.onError, [i._.transportError(i.resources.eventSourceError, e.transport, n)]))
                }
            }, !1)
        }, reconnect: function (n) {
            r.reconnect(n, this.name)
        }, lostConnection: function (n) {
            this.reconnect(n)
        }, send: function (n, t) {
            r.ajaxSend(n, t)
        }, stop: function (n) {
            r.clearReconnectTimeout(n);
            n && n.eventSource && (n.log("EventSource calling close()."), n.eventSource.close(), n.eventSource = null, delete n.eventSource)
        }, abort: function (n, t) {
            r.ajaxAbort(n, t)
        }
    }
}(window.jQuery, window),
function (n, t) {
    "use strict";
    var r = n.signalR,
        e = n.signalR.events,
        o = n.signalR.changeState,
        i = r.transports._logic,
        u = function () {
            var n = t.document.createElement("iframe");
            return n.setAttribute("style", "position:absolute;top:0;left:0;width:0;height:0;visibility:hidden;"), n
        },
        f = function () {
            var i = null,
                f = 1e3,
                n = 0;
            return {
                prevent: function () {
                    r._.ieVersion <= 8 && (n === 0 && (i = t.setInterval(function () {
                        var n = u();
                        t.document.body.appendChild(n);
                        t.document.body.removeChild(n);
                        n = null
                    }, f)), n++)
                }, cancel: function () {
                    n === 1 && t.clearInterval(i);
                    n > 0 && n--
                }
            }
        }();
    r.transports.foreverFrame = {
        name: "foreverFrame",
        supportsKeepAlive: !0,
        iframeClearThreshold: 50,
        start: function (n, r, e) {
            var l = this,
                s = i.foreverFrame.count += 1,
                h, o = u(),
                c = function () {
                    n.log("Forever frame iframe finished loading and is no longer receiving messages, reconnecting.");
                    l.reconnect(n)
                };
            if (t.EventSource) {
                e && (n.log("This browser supports SSE, skipping Forever Frame."), e());
                return
            }
            o.setAttribute("data-signalr-connection-id", n.id);
            f.prevent();
            h = i.getUrl(n, this.name);
            h += "&frameId=" + s;
            t.document.body.appendChild(o);
            n.log("Binding to iframe's load event.");
            o.addEventListener ? o.addEventListener("load", c, !1) : o.attachEvent && o.attachEvent("onload", c);
            o.src = h;
            i.foreverFrame.connections[s] = n;
            n.frame = o;
            n.frameId = s;
            r && (n.onSuccess = function () {
                n.log("Iframe transport started.");
                r()
            })
        }, reconnect: function (n) {
            var r = this;
            i.verifyLastActive(n) && t.setTimeout(function () {
                if (i.verifyLastActive(n) && n.frame && i.ensureReconnectingState(n)) {
                    var u = n.frame,
                        t = i.getUrl(n, r.name, !0) + "&frameId=" + n.frameId;
                    n.log("Updating iframe src to '" + t + "'.");
                    u.src = t
                }
            }, n.reconnectDelay)
        }, lostConnection: function (n) {
            this.reconnect(n)
        }, send: function (n, t) {
            i.ajaxSend(n, t)
        }, receive: function (t, u) {
            var f, e;
            if (i.processMessages(t, u, t.onSuccess), t.state === n.signalR.connectionState.connected && (t.frameMessageCount = (t.frameMessageCount || 0) + 1, t.frameMessageCount > r.transports.foreverFrame.iframeClearThreshold && (t.frameMessageCount = 0, f = t.frame.contentWindow || t.frame.contentDocument, f && f.document && f.document.body)))
                for (e = f.document.body; e.firstChild;) e.removeChild(e.firstChild)
        }, stop: function (n) {
            var r = null;
            if (f.cancel(), n.frame) {
                if (n.frame.stop) n.frame.stop();
                else try {
                    r = n.frame.contentWindow || n.frame.contentDocument;
                    r.document && r.document.execCommand && r.document.execCommand("Stop")
                } catch (u) {
                    n.log("Error occured when stopping foreverFrame transport. Message = " + u.message + ".")
                }
                n.frame.parentNode === t.document.body && t.document.body.removeChild(n.frame);
                delete i.foreverFrame.connections[n.frameId];
                n.frame = null;
                n.frameId = null;
                delete n.frame;
                delete n.frameId;
                delete n.onSuccess;
                delete n.frameMessageCount;
                n.log("Stopping forever frame.")
            }
        }, abort: function (n, t) {
            i.ajaxAbort(n, t)
        }, getConnection: function (n) {
            return i.foreverFrame.connections[n]
        }, started: function (t) {
            o(t, r.connectionState.reconnecting, r.connectionState.connected) === !0 && n(t).triggerHandler(e.onReconnect)
        }
    }
}(window.jQuery, window),
function (n, t) {
    "use strict";
    var i = n.signalR,
        u = n.signalR.events,
        e = n.signalR.changeState,
        f = n.signalR.isDisconnecting,
        r = i.transports._logic;
    i.transports.longPolling = {
        name: "longPolling",
        supportsKeepAlive: !1,
        reconnectDelay: 3e3,
        start: function (o, s, h) {
            var a = this,
                v = function () {
                    v = n.noop;
                    o.log("LongPolling connected.");
                    s();
                    h = null
                },
                y = function () {
                    return h ? (h(), h = null, o.log("LongPolling failed to connect."), !0) : !1
                },
                c = o._,
                l = 0,
                p = function (r) {
                    t.clearTimeout(c.reconnectTimeoutId);
                    c.reconnectTimeoutId = null;
                    e(r, i.connectionState.reconnecting, i.connectionState.connected) === !0 && (r.log("Raising the reconnect event"), n(r).triggerHandler(u.onReconnect))
                },
                w = 36e5;
            o.pollXhr && (o.log("Polling xhr requests already exists, aborting."), o.stop());
            o.messageId = null;
            c.reconnectTimeoutId = null;
            c.pollTimeoutId = t.setTimeout(function () {
                (function e(s, h) {
                    var d = s.messageId,
                        g = d === null,
                        b = !g,
                        nt = !h,
                        k = r.getUrl(s, a.name, b, nt);
                    f(s) !== !0 && (o.log("Opening long polling request to '" + k + "'."), s.pollXhr = n.ajax(n.extend({}, n.signalR.ajaxDefaults, {
                        xhrFields: {
                            withCredentials: o.withCredentials
                        },
                        url: k,
                        type: "GET",
                        dataType: o.ajaxDataType,
                        contentType: o.contentType,
                        success: function (i) {
                            var h, w = 0,
                                u, a;
                            o.log("Long poll complete.");
                            l = 0;
                            try {
                                h = o._parseResponse(i)
                            } catch (b) {
                                r.handleParseFailure(s, i, b, y, s.pollXhr);
                                return
                            } (c.reconnectTimeoutId !== null && p(s), h && (u = r.maximizePersistentResponse(h)), r.processMessages(s, h, v), u && n.type(u.LongPollDelay) === "number" && (w = u.LongPollDelay), u && u.Disconnect) || f(s) !== !0 && (a = u && u.ShouldReconnect, !a || r.ensureReconnectingState(s)) && (w > 0 ? c.pollTimeoutId = t.setTimeout(function () {
                                e(s, a)
                            }, w) : e(s, a))
                        }, error: function (f, h) {
                            if (t.clearTimeout(c.reconnectTimeoutId), c.reconnectTimeoutId = null, h === "abort") {
                                o.log("Aborted xhr request.");
                                return
                            }
                            if (!y()) {
                                if (l++, o.state !== i.connectionState.reconnecting && (o.log("An error occurred using longPolling. Status = " + h + ".  Response = " + f.responseText + "."), n(s).triggerHandler(u.onError, [i._.transportError(i.resources.longPollFailed, o.transport, f, s.pollXhr)])), (o.state === i.connectionState.connected || o.state === i.connectionState.reconnecting) && !r.verifyLastActive(o)) return;
                                if (!r.ensureReconnectingState(s)) return;
                                c.pollTimeoutId = t.setTimeout(function () {
                                    e(s, !0)
                                }, a.reconnectDelay)
                            }
                        }
                    })), b && h === !0 && (c.reconnectTimeoutId = t.setTimeout(function () {
                        p(s)
                    }, Math.min(1e3 * (Math.pow(2, l) - 1), w))))
                })(o)
            }, 250)
        }, lostConnection: function () {
            throw new Error("Lost Connection not handled for LongPolling");
        }, send: function (n, t) {
            r.ajaxSend(n, t)
        }, stop: function (n) {
            t.clearTimeout(n._.pollTimeoutId);
            t.clearTimeout(n._.reconnectTimeoutId);
            delete n._.pollTimeoutId;
            delete n._.reconnectTimeoutId;
            n.pollXhr && (n.pollXhr.abort(), n.pollXhr = null, delete n.pollXhr)
        }, abort: function (n, t) {
            r.ajaxAbort(n, t)
        }
    }
}(window.jQuery, window),
function (n) {
    "use strict";

    function r(n) {
        return n + e
    }

    function s(n, t, i) {
        for (var f = n.length, u = [], r = 0; r < f; r += 1) n.hasOwnProperty(r) && (u[r] = t.call(i, n[r], r, n));
        return u
    }

    function h(t) {
        return n.isFunction(t) ? null : n.type(t) === "undefined" ? null : t
    }

    function u(n) {
        for (var t in n)
            if (n.hasOwnProperty(t)) return !0;
        return !1
    }

    function f(n, t) {
        var i = n._.invocationCallbacks,
            r, f;
        u(i) && n.log("Clearing hub invocation callbacks with error: " + t + ".");
        n._.invocationCallbackId = 0;
        delete n._.invocationCallbacks;
        n._.invocationCallbacks = {};
        for (f in i) r = i[f], r.method.call(r.scope, {
            E: t
        })
    }

    function i(n, t) {
        return new i.fn.init(n, t)
    }

    function t(i, r) {
        var u = {
            qs: null,
            logging: !1,
            useDefaultPath: !0
        };
        return n.extend(u, r), (!i || u.useDefaultPath) && (i = (i || "") + "/signalr"), new t.fn.init(i, u)
    }
    var e = ".hubProxy",
        o = n.signalR;
    i.fn = i.prototype = {
        init: function (n, t) {
            this.state = {};
            this.connection = n;
            this.hubName = t;
            this._ = {
                callbackMap: {}
            }
        }, hasSubscriptions: function () {
            return u(this._.callbackMap)
        }, on: function (t, i) {
            var u = this,
                f = u._.callbackMap;
            return t = t.toLowerCase(), f[t] || (f[t] = {}), f[t][i] = function (n, t) {
                i.apply(u, t)
            }, n(u).bind(r(t), f[t][i]), u
        }, off: function (t, i) {
            var e = this,
                o = e._.callbackMap,
                f;
            return t = t.toLowerCase(), f = o[t], f && (f[i] ? (n(e).unbind(r(t), f[i]), delete f[i], u(f) || delete o[t]) : i || (n(e).unbind(r(t)), delete o[t])), e
        }, invoke: function (t) {
            var i = this,
                r = i.connection,
                e = n.makeArray(arguments).slice(1),
                c = s(e, h),
                f = {
                    H: i.hubName,
                    M: t,
                    A: c,
                    I: r._.invocationCallbackId
                },
                u = n.Deferred(),
                l = function (f) {
                    var e = i._maximizeHubResponse(f),
                        h, s;
                    n.extend(i.state, e.State);
                    e.Error ? (e.StackTrace && r.log(e.Error + "\n" + e.StackTrace + "."), h = e.IsHubException ? "HubException" : "Exception", s = o._.error(e.Error, h), s.data = e.ErrorData, r.log(i.hubName + "." + t + " failed to execute. Error: " + s.message), u.rejectWith(i, [s])) : (r.log("Invoked " + i.hubName + "." + t), u.resolveWith(i, [e.Result]))
                };
            return r._.invocationCallbacks[r._.invocationCallbackId.toString()] = {
                scope: i,
                method: l
            }, r._.invocationCallbackId += 1, n.isEmptyObject(i.state) || (f.S = i.state), r.log("Invoking " + i.hubName + "." + t), r.send(f), u.promise()
        }, _maximizeHubResponse: function (n) {
            return {
                State: n.S,
                Result: n.R,
                Id: n.I,
                IsHubException: n.H,
                Error: n.E,
                StackTrace: n.T,
                ErrorData: n.D
            }
        }
    };
    i.fn.init.prototype = i.fn;
    t.fn = t.prototype = n.connection();
    t.fn.init = function (t, i) {
        var e = {
            qs: null,
            logging: !1,
            useDefaultPath: !0
        },
            u = this;
        n.extend(e, i);
        n.signalR.fn.init.call(u, t, e.qs, e.logging);
        u.proxies = {};
        u._.invocationCallbackId = 0;
        u._.invocationCallbacks = {};
        u.received(function (t) {
            var i, o, f, e, s, h;
            t && (typeof t.I != "undefined" ? (f = t.I.toString(), e = u._.invocationCallbacks[f], e && (u._.invocationCallbacks[f] = null, delete u._.invocationCallbacks[f], e.method.call(e.scope, t))) : (i = this._maximizeClientHubInvocation(t), u.log("Triggering client hub event '" + i.Method + "' on hub '" + i.Hub + "'."), s = i.Hub.toLowerCase(), h = i.Method.toLowerCase(), o = this.proxies[s], n.extend(o.state, i.State), n(o).triggerHandler(r(h), [i.Args])))
        });
        u.error(function (n, t) {
            var i, r;
            t && (i = t.I, r = u._.invocationCallbacks[i], r && (u._.invocationCallbacks[i] = null, delete u._.invocationCallbacks[i], r.method.call(r.scope, {
                E: n
            })))
        });
        u.reconnecting(function () {
            u.transport && u.transport.name === "webSockets" && f(u, "Connection started reconnecting before invocation result was received.")
        });
        u.disconnected(function () {
            f(u, "Connection was disconnected before invocation result was received.")
        })
    };
    t.fn._maximizeClientHubInvocation = function (n) {
        return {
            Hub: n.H,
            Method: n.M,
            Args: n.A,
            State: n.S
        }
    };
    t.fn._registerSubscribedHubs = function () {
        var t = this;
        t._subscribedToHubs || (t._subscribedToHubs = !0, t.starting(function () {
            var i = [];
            n.each(t.proxies, function (n) {
                this.hasSubscriptions() && (i.push({
                    name: n
                }), t.log("Client subscribed to hub '" + n + "'."))
            });
            i.length === 0 && t.log("No hubs have been subscribed to.  The client will not receive data from hubs.  To fix, declare at least one client side function prior to connection start for each hub you wish to subscribe to.");
            t.data = t.json.stringify(i)
        }))
    };
    t.fn.createHubProxy = function (n) {
        n = n.toLowerCase();
        var t = this.proxies[n];
        return t || (t = i(this, n), this.proxies[n] = t), this._registerSubscribedHubs(), t
    };
    t.fn.init.prototype = t.fn;
    n.hubConnection = t
}(window.jQuery, window),
function (n) {
    n.signalR.version = "2.0.2"
}(window.jQuery)