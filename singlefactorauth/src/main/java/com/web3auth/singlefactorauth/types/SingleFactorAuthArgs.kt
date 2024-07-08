package com.web3auth.singlefactorauth.types

import org.torusresearch.fetchnodedetails.types.TorusNetwork

class SingleFactorAuthArgs(network: TorusNetwork, clientid: String) {
    private var network: TorusNetwork
    var clientid: String
    var networkUrl: String? = null

    init {
        this.network = network
        this.clientid = clientid
    }

    fun getNetwork(): TorusNetwork {
        return network
    }

    fun setNetwork(network: TorusNetwork) {
        this.network = network
    }

    companion object {
        var SIGNER_MAP: HashMap<TorusNetwork?, String?> = object : HashMap<TorusNetwork?, String?>() {
            init {
                put(TorusNetwork.MAINNET, "https://signer.tor.us")
                put(TorusNetwork.TESTNET, "https://signer.tor.us")
                put(TorusNetwork.CYAN, "https://signer-polygon.tor.us")
                put(TorusNetwork.AQUA, "https://signer-polygon.tor.us")
            }
        }
    }
}