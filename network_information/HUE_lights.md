{
	"lights": {
		"1": {
			"state": {
				"on": false,
				"bri": 154,
				"hue": 35941,
				"sat": 254,
				"effect": "none",
				"xy": [
					0.1619,
					0.3862
				],
				"ct": 153,
				"alert": "none",
				"colormode": "xy",
				"mode": "homeautomation",
				"reachable": true
			},
			"swupdate": {
				"state": "noupdates",
				"lastinstall": "2018-04-05T20:55:47"
			},
			"type": "Extended color light",
			"name": "Hue color lamp 1",
			"modelid": "LCT015",
			"manufacturername": "Philips",
			"productname": "Hue color lamp",
			"capabilities": {
				"certified": true,
				"control": {
					"mindimlevel": 1000,
					"maxlumen": 806,
					"colorgamuttype": "C",
					"colorgamut": [
						[
							0.6915,
							0.3083
						],
						[
							0.17,
							0.7
						],
						[
							0.1532,
							0.0475
						]
					],
					"ct": {
						"min": 153,
						"max": 500
					}
				},
				"streaming": {
					"renderer": true,
					"proxy": true
				}
			},
			"config": {
				"archetype": "sultanbulb",
				"function": "mixed",
				"direction": "omnidirectional"
			},
			"uniqueid": "00:17:88:01:03:8c:2c:90-0b",
			"swversion": "1.29.0_r21169",
			"swconfigid": "3416C2DD",
			"productid": "Philips-LCT015-1-A19ECLv5"
		},
		"2": {
			"state": {
				"on": false,
				"bri": 154,
				"hue": 35941,
				"sat": 254,
				"effect": "none",
				"xy": [
					0.1619,
					0.3862
				],
				"ct": 153,
				"alert": "none",
				"colormode": "xy",
				"mode": "homeautomation",
				"reachable": true
			},
			"swupdate": {
				"state": "noupdates",
				"lastinstall": "2018-04-05T19:41:00"
			},
			"type": "Extended color light",
			"name": "Hue color lamp 2",
			"modelid": "LCT015",
			"manufacturername": "Philips",
			"productname": "Hue color lamp",
			"capabilities": {
				"certified": true,
				"control": {
					"mindimlevel": 1000,
					"maxlumen": 806,
					"colorgamuttype": "C",
					"colorgamut": [
						[
							0.6915,
							0.3083
						],
						[
							0.17,
							0.7
						],
						[
							0.1532,
							0.0475
						]
					],
					"ct": {
						"min": 153,
						"max": 500
					}
				},
				"streaming": {
					"renderer": true,
					"proxy": true
				}
			},
			"config": {
				"archetype": "sultanbulb",
				"function": "mixed",
				"direction": "omnidirectional"
			},
			"uniqueid": "00:17:88:01:03:d0:b4:8d-0b",
			"swversion": "1.29.0_r21169",
			"swconfigid": "3416C2DD",
			"productid": "Philips-LCT015-1-A19ECLv5"
		}
	},
	"groups": {
		"1": {
			"name": "Wohnzimmer",
			"lights": [
				"1",
				"2"
			],
			"type": "Room",
			"state": {
				"all_on": false,
				"any_on": false
			},
			"recycle": false,
			"class": "Living room",
			"action": {
				"on": false,
				"bri": 154,
				"hue": 35941,
				"sat": 254,
				"effect": "none",
				"xy": [
					0.1619,
					0.3862
				],
				"ct": 153,
				"alert": "none",
				"colormode": "xy"
			}
		},
		"2": {
			"name": "SML",
			"lights": [
				"1",
				"2"
			],
			"type": "LightGroup",
			"state": {
				"all_on": false,
				"any_on": false
			},
			"recycle": false,
			"action": {
				"on": false,
				"bri": 154,
				"hue": 35941,
				"sat": 254,
				"effect": "none",
				"xy": [
					0.1619,
					0.3862
				],
				"ct": 153,
				"alert": "none",
				"colormode": "xy"
			}
		},
		"3": {
			"name": "Entertainment-Bereich 1",
			"lights": [
				"2",
				"1"
			],
			"type": "Entertainment",
			"state": {
				"all_on": false,
				"any_on": false
			},
			"recycle": false,
			"class": "TV",
			"stream": {
				"proxymode": "manual",
				"proxynode": "/lights/2",
				"active": false,
				"owner": null
			},
			"locations": {
				"1": [
					-0.72,
					0.65,
					0
				],
				"2": [
					0.64,
					0.66,
					0
				]
			},
			"action": {
				"on": false,
				"bri": 154,
				"hue": 35941,
				"sat": 254,
				"effect": "none",
				"xy": [
					0.1619,
					0.3862
				],
				"ct": 153,
				"alert": "none",
				"colormode": "xy"
			}
		}
	},
	"config": {
		"name": "Philips hue",
		"zigbeechannel": 25,
		"bridgeid": "001788FFFEAEBB47",
		"mac": "00:17:88:ae:bb:47",
		"dhcp": true,
		"ipaddress": "141.62.63.116",
		"netmask": "255.255.255.0",
		"gateway": "141.62.63.254",
		"proxyaddress": "none",
		"proxyport": 0,
		"UTC": "2018-04-10T10:25:04",
		"localtime": "2018-04-10T12:25:04",
		"timezone": "Europe/Berlin",
		"modelid": "BSB002",
		"datastoreversion": "70",
		"swversion": "1802201122",
		"apiversion": "1.24.0",
		"swupdate": {
			"updatestate": 0,
			"checkforupdate": false,
			"devicetypes": {
				"bridge": false,
				"lights": [],
				"sensors": []
			},
			"url": "",
			"text": "",
			"notify": true
		},
		"swupdate2": {
			"checkforupdate": false,
			"lastchange": "2018-04-05T20:55:54",
			"bridge": {
				"state": "noupdates",
				"lastinstall": "2018-04-05T14:10:54"
			},
			"state": "noupdates",
			"autoinstall": {
				"updatetime": "T21:05:00",
				"on": true
			}
		},
		"linkbutton": false,
		"portalservices": true,
		"portalconnection": "connected",
		"portalstate": {
			"signedon": true,
			"incoming": false,
			"outgoing": true,
			"communication": "disconnected"
		},
		"internetservices": {
			"internet": "connected",
			"remoteaccess": "connected",
			"time": "connected",
			"swupdate": "connected"
		},
		"factorynew": false,
		"replacesbridgeid": null,
		"backup": {
			"status": "idle",
			"errorcode": 0
		},
		"starterkitid": "",
		"whitelist": {
			"ID6K0YlUfB3OLslxbjzmfQbElDhwN1tTZHrh403A": {
				"last use date": "1980-01-01T00:19:40",
				"create date": "1980-01-01T00:19:40",
				"name": "ColorsForHue#christians-macbook-pro-2.lo"
			},
			"JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo": {
				"last use date": "2018-04-10T10:25:04",
				"create date": "1980-01-01T00:00:32",
				"name": "hue_ios_app#Christians Ipad"
			},
			"DILymzOfbaR69iAhIu5fdQFYWKHeF3VpAVVUBi57": {
				"last use date": "2018-04-05T11:37:21",
				"create date": "2018-04-05T11:13:37",
				"name": "Hue 2#Samsung SM-G920F"
			},
			"qq8Lh-oM5-D8LamlOnEkDyWG6CSCRK30SfmJQb6q": {
				"last use date": "2018-04-05T11:22:21",
				"create date": "2018-04-05T11:15:24",
				"name": "SyncMyLights#A0001"
			},
			"QvpNp1gE5b3DFDYHojyw4krRyltxaLq9TGsYvuLF": {
				"last use date": "2018-04-05T11:37:21",
				"create date": "2018-04-05T11:15:33",
				"name": "lol#matvey"
			},
			"A0lmyJG32r8a3oMyPFJEdATe3HbrW6L7bxdgOKoz": {
				"last use date": "2018-04-05T11:22:21",
				"create date": "2018-04-05T11:17:28",
				"name": "Huemanic#D5803"
			},
			"MmN0cnYUanQM9shSzHC19Bo1ssxn-OrOk3P-jirf": {
				"last use date": "2018-04-06T17:55:53",
				"create date": "2018-04-05T11:22:43",
				"name": "Hue 2#Sony D5803"
			},
			"bCC6PYIerDdNOhvCUJ8Y8bBicSgB8-ua65FRN5Ez": {
				"last use date": "2018-04-05T11:37:21",
				"create date": "2018-04-05T11:25:19",
				"name": "Hue 2#OnePlus A0001"
			},
			"qcmHeeZYbr9L1cDBJ7Qqyy135UDnQkjy63D4KzS6": {
				"last use date": "2018-04-05T14:25:53",
				"create date": "2018-04-05T14:12:47",
				"name": "ColorsForHue#christians-macbook-pro-2.lo"
			},
			"lnaxGMrGtgOuARcJJCH3QU36uxITzXAzrhUs8Riq": {
				"last use date": "2018-04-05T19:10:53",
				"create date": "2018-04-05T19:05:30",
				"name": "huelabs2#WebKit - iOS"
			},
			"VM4jPfT85QJ5bGPnG548esIRMEKregNhdvZG7CX5": {
				"last use date": "2018-04-10T10:12:50",
				"create date": "2018-04-10T10:03:45",
				"name": "my_hue_app#iphone peter"
			},
			"2TeULiV39yp9KBmAPBkosXnJ8FKt-7pvuXdsSpIC": {
				"last use date": "2018-04-10T10:25:04",
				"create date": "2018-04-10T10:24:38",
				"name": "my_hue_app#iphone peter"
			}
		}
	},
	"schedules": {},
	"scenes": {
		"btcEY3vUMVqvjB7": {
			"name": "Entspannen",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "x7x6D_r01_d01"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"3o5mSZjmNSZgSvR": {
			"name": "Lesen",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "iuFE5_r01_d02"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"a9hwxSfMUK5tEc6": {
			"name": "Konzentrieren",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "5EOSD_r01_d03"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"sAE6kyGzHlRtWQ4": {
			"name": "Energie tanken",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "iOjbZ_r01_d04"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"aruqGHQFaHVr0je": {
			"name": "Hell",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "PhXvE_r01_d05"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"dENcnyzsGyCur-K": {
			"name": "Gedimmt",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "YBCwn_r01_d06"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"iCDAVMAFv4DHafk": {
			"name": "Nachtlicht",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "oQ8dA_r01_d07"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"KvglU-FH3u24NG6": {
			"name": "Sonnenuntergang Savanne",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "Bgv11_r01_d15"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"VnlZUQAdYRpd77w": {
			"name": "Tropendämmerung",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "ssdyB_r01_d16"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"KtIYXwxv1tj9GEL": {
			"name": "Nordlichter",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "MtRUb_r01_d17"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:04",
			"version": 2
		},
		"sDW2rXcSi3qh3Fi": {
			"name": "Frühlingsblüten",
			"lights": [
				"1",
				"2"
			],
			"owner": "JcOZbDqxWJZ6fqbeXw5ZaAEFlIclSApWNcI0dmJo",
			"recycle": false,
			"locked": false,
			"appdata": {
				"version": 1,
				"data": "0YEs0_r01_d18"
			},
			"picture": "",
			"lastupdated": "2018-04-05T11:09:05",
			"version": 2
		}
	},
	"rules": {},
	"sensors": {
		"1": {
			"state": {
				"daylight": null,
				"lastupdated": "none"
			},
			"config": {
				"on": true,
				"configured": false,
				"sunriseoffset": 30,
				"sunsetoffset": -30
			},
			"name": "Daylight",
			"type": "Daylight",
			"modelid": "PHDL00",
			"manufacturername": "Philips",
			"swversion": "1.0"
		}
	},
	"resourcelinks": {}
}
