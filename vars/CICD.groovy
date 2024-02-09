// Import the package
package sharedLib.vars

// Implement Serializable interface
class GitHelp implements Serializable {

    // Define a script property
    def script

    // Constructor that takes a script parameter
    GitHelp(script) {
        this.script = script
    }

    // Method to perform Git clone or fetch
    def gitCloneOrFetch(String repoUrl) {
        script.echo "Cloning/Fetching from ${repoUrl}"
        script.git(url: repoUrl)
    }
}
